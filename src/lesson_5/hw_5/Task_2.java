package lesson_5.hw_5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /**
         * 2
         * 1.1. Создай массив на 10 чисел
         * 1.2. Считай с консоли 10 чисел и заполни ими массив
         * 2. Найти максимальное число из элементов массива**/

        Scanner scanner = new Scanner(System.in);
        float[] arrayFloat = new float[10];
        float max =  Float.MIN_VALUE;
        System.out.println("Введите 10 чисел");

        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = scanner.nextFloat();
            if (arrayFloat[i] > max) {
                max = arrayFloat[i];
            }
        }
        System.out.println("Максимальное число равно " + max);
    }
}
