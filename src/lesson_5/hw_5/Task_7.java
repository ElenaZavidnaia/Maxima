package lesson_5.hw_5;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        /**
         * 7
         *
         * Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.**/

        Scanner scanner = new Scanner(System.in);
        float[] arrayNumber = new float[20];
        float tmp;

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = scanner.nextFloat();
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber.length; j++) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    tmp = arrayNumber[j];
                    arrayNumber[j] = arrayNumber[i];
                    arrayNumber[i] = tmp;
                }
            }
        }

        int i = 0;
        while (i < arrayNumber.length - 1) {
            System.out.println(arrayNumber[i]);
            i++;
        }
    }
}
