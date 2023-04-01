package lesson_5.hw_5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /**
         *
         * 1. Создать массив на 10 строк.
         * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
         * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.**/

        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[10];
        System.out.println("Введите 8 строк");

        for (int i = 0; i < 8; i++) {
            arrayString[i] = scanner.nextLine();
        }

        int i=arrayString.length-1;
        while (i>=0){
            System.out.println(arrayString[i]);
            i--;
        }
    }
}
