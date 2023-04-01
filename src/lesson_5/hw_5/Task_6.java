package lesson_5.hw_5;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        /**
         * 6
         *
         * Создать массив на 20 чисел.
         * Заполнить его числами с клавиатуры.
         * Найти максимальное и минимальное числа в массиве.
         * Вывести на экран максимальное и минимальное числа через пробел.**/

        Scanner scanner = new Scanner(System.in);
        float[] arrayNumber = new float[20];
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = scanner.nextFloat();
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]) {
                min = arrayNumber[i];
            }
            if (max < arrayNumber[i]) {
                max = arrayNumber[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
