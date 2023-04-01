package lesson_5.hw_5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        /**
         *4
         *
         * 1. Создать массив на 10 чисел.
         * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
         * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки. **/

        float[] arrayNumbers = new float[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayNumbers.length-1; i++) {
            arrayNumbers[i] = scanner.nextFloat();
        }
        for (int i = arrayNumbers.length - 1; i >= 0; i--) {
            System.out.println(arrayNumbers[i]);
        }
    }
}
