package lesson_5.hw_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        /**
         * 5
         *
         * 1. Создать массив на 20 чисел.
         * 2. Ввести в него значения с клавиатуры.
         * 3. Создать два массива на 10 чисел каждый.
         * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
         * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.**/

        Scanner scanner = new Scanner(System.in);
        float[] bigArrayNumber = new float[20];
        float[] littleArrayNumber_1 = new float[10];
        float[] littleArrayNumber_2 = new float[10];
        int sme;
        for (int i = 0; i < bigArrayNumber.length; i++) {
            bigArrayNumber[i] = scanner.nextFloat();
        }

        sme = bigArrayNumber.length / 2;

        for (int i = 0; i < sme; i++) {
            littleArrayNumber_1[i] = bigArrayNumber[i];
            littleArrayNumber_2[i] = bigArrayNumber[sme + i];
            System.out.println(littleArrayNumber_2[i]);
        }
    }
}
