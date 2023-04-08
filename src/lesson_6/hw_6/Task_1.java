package lesson_6.hw_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /**
         * Задача:
         * 1
         *
         * Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         * Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
         *
         * Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         * Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
         * Программа выводит слова на экран.**/

        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[1000];
        String tmp = "";
        int i = 0;

//=========Задача========
        while ((tmp = scanner.nextLine()) != "") {
            arrayString[i++] = tmp;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(arrayString[j].toUpperCase());
        }

        System.out.println();

//=========Новая задача========
        i = 0;

        while ((tmp = scanner.nextLine()) != "") {
            arrayString[i++] = tmp;
        }

        for (int j = 0; j < i; j++) {
            if ((arrayString[j].length() % 2) == 0) {
                arrayString[j] = arrayString[j].concat(arrayString[j]);
            } else {
                arrayString[j] = arrayString[j].concat(arrayString[j]).concat(arrayString[j]);
            }
            System.out.println(arrayString[j]);
        }
    }
}
