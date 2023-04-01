package lesson_5.hw_5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /**
         * 3
         *
         * СО ЗВЕЗДОЧКОЙ
         *
         * 1. Создать массив на 10 строк.
         * 2. Создать массив на 10 чисел.
         * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
         * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
         * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.**/

        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[10];
        int[] arrayLength = new int[10];
        System.out.println("Введите 10 строк");

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = scanner.nextLine();
            arrayLength[i] = arrayString[i].length();
        }
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Строка " + arrayString[i] + " длины " + arrayLength[i]);
        }
    }
}
