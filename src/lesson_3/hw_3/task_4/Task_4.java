package lesson_3.hw_3.task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        /**
         * 4
         * Написать программу, которая будет проверять число, которое мы подадим ей.
         * Если число положительное, то увеличить его в два раза.
         * Если число отрицательное, то прибавить единицу.
         * Если введенное число равно нулю, необходимо вывести ноль.
         * Вывести результат в консоль.**/
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else {
            System.out.println(number);
        }
    }
}
