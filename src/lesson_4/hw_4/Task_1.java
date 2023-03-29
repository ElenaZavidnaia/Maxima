package lesson_4.hw_4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /**
         * 1
         * Ввести с клавиатуры два числа m и n.
         * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
         *
         * Пример: m=2, n=4
         * 8888
         * 8888**/

        Scanner scanner = new Scanner(System.in);
        System.out.print("m=");
        int m = scanner.nextInt();
        System.out.print("n=");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
