package lesson_3.hw_3.task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /**
         *3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
         *
         * Пример для номера месяца 2:
         * зима
         *
         * Пример для номера месяца 5:
         * весна **/
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 12, 1, 2:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
            default:
                break;
        }
    }
}
