package lesson_4.hw_4;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        /**
         * 5
         * Ввести с клавиатуры строку name.
         * Ввести с клавиатуры дату рождения (три числа): y, m, d.
         *
         * Вывести на экран текст:
         * "Меня зовут name.
         * Я родился d.m.y"
         *
         * Пример вывода:
         * Меня зовут Вася.
         * Я родился 15.2.1988**/

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        int y = scanner1.nextInt();
        int m = scanner1.nextInt();
        int d = scanner1.nextInt();
        System.out.println();

        System.out.printf("Меня зовут %s.", name);
        System.out.println();
        System.out.printf("Я родился %d.%d.%d",d,m,y);
    }
}
