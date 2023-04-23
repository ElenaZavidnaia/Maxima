package lesson_9.game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Scanner scanner;
    char[][] table;
    Random random;

    public TicTacToe() {
        scanner = new Scanner(System.in);
        random = new Random();
        table = new char[5][5];
    }

    public void playGame() {
        System.out.println("Game is started!");
        initTable();
        printTable();

        while (true) {
            turnHuman();
            if (checkWin('x')) {
                printTable();
                System.out.println("YOU WON");
                break;
            }

            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {
                printTable();
                System.out.println("AI WON");
                break;
            }
        }

    }

    public void initTable() {

        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = '.';
            }
        }
    }

    public void printTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void turnHuman() {
        int x, y;

        do {
            System.out.println("Enter x and y from [1...5]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        table[x][y] = 'x';
    }

    public boolean isCellValid(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) {
            return false;
        }

        return table[x][y] == '.';
    }

    public boolean checkWin(char symbol) {
        int compG = 0, compV = 0;
        boolean compD1 = false, compD2 = false;

        compG = 0;
        for (int i = 0; i < 5; i++) {
            if (compG == 3) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                if ((table[i][j] == symbol) && (table[i][j + 1] == symbol)) {
                    compG++;
                }
            }

        }

        compV = 0;
        for (int j = 0; j < 5; j++) {
            if (compV == 3) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                if ((table[i][j] == symbol) && (table[i + 1][j] == symbol)) {
                    compV++;
                }
            }
        }

        //По диагонали
        compD1 = true;
        for (int i = 0; i < 5; i++) {
            if (table[i][i] != symbol) {
                compD1 = false;
            }
        }

        compD2 = true;
        for (int i = 4; i >= 0; i--) {
            if (table[i][4 - i] != symbol) {
                compD2 = false;
            }
        }

        if ((compG == 3) || (compV == 3) || compD1 || compD2) {
            return true;
        }

        return false;
    }

    public boolean isTableFull() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                if (table[x][y] == '.') return false;
            }
        }
        return true;
    }

    public void turnAI() {
        int x, y;

        do {
            x = random.nextInt(0, 4);
            y = random.nextInt(0, 4);
        } while (!isCellValid(x, y));

        table[x][y] = 'o';
    }
}












/*
public class TicTacToe {
    Scanner scanner;
    char[][] table;
    Random random;

    public TicTacToe() {
        scanner = new Scanner(System.in);
        random = new Random();
        table = new char[5][5];
    }

    public void playGame() {
        System.out.println("Game is started!");
        initTable();
        printTable();

        while (true) {
            printTabley();
            turnHuman();
            if (checkWin('x')) {
                printTable();
                System.out.println("YOU WON");
                break;
            }

            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {
                printTable();
                System.out.println("AI WON");
                break;
            }
        }


    }

    public void initTable() {
//        TicTacToe t = new TicTacToe();
//        t.playGame();

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = '.';
            }
        }
    }

    public void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    public void turnHuman() {
        int x, y;

        do {
            System.out.println("Enter x and y from [1...5]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        table[y][x] = 'x';
    }

    public boolean isCellValid(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) {
            return false;
        }

        return table[y][x] == '.';
    }

    public boolean checkWin(char symbol) {
        boolean compG = false, compV = false, compD = false;
        //По горизонтали
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((table[i][j] == symbol) && (table[i][j + 1] == symbol)) {
                    compG = true;
                } else {
                    compG = false;
                    break;
                }
            }
            if (compG) {
                break;
            }
        }

        //По вертикали
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                if ((table[i][j] == symbol) && (table[i + 1][j] == symbol)) {
                    compV = true;
                } else {
                    compV = false;
                    break;
                }
            }
            if (compV) {
                break;
            }
        }

        //По диагонали
        compD = true;
        for (int j = 0; j < 5; j++) {
            if (table[j][j] != symbol) {
                compD = false;
            }
        }

        for (int j = 4; j >= 0; j--) {
            if (table[j][j] != symbol) {
                compD = false;
            }
        }

        if (compG || compV || compD) {
            return true;
        }

        return false;

    }

    public boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                if (table[y][x] == '.') return false;
            }
        }
        return true;
    }

    public void turnAI() {
        int x, y;

        do {
            x = random.nextInt(0, 4);
            y = random.nextInt(0, 4);
        } while (!isCellValid(x, y));

        table[y][x] = 'o';
    }

    public void printTabley() {
        for (int i = 0; i < 3; i++) {
            System.out.println(table[i][1]);
        }

    }
}
*/