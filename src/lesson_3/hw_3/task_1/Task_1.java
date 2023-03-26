package lesson_3.hw_3.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /**
         * 1 Написать программу, чтобы она:
         * - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
         * - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
         * - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.**/
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        if (number < 5) {
            System.out.println("Число меньше 5");
        } else if (number > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }

    }
}
