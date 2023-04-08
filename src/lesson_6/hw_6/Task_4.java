package lesson_6.hw_6;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        /**
         *4
         *
         * 1. Создать массив на 10 строк.
         * 2. Создать массив на 10 чисел.
         * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
         * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
         * которой совпадает с текущим индексом из массива чисел. **/

        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[10];
        int[] arrayNumber = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayString[i] = scanner.nextLine();
            arrayNumber[i] = arrayString[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Строка " + arrayString[i] + " длиной " + arrayNumber[i]);
        }
    }
}
