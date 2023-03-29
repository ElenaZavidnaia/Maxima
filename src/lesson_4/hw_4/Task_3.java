package lesson_4.hw_4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /**
         * Ввести с клавиатуры три числа, вывести на экран среднее из них.
         * Т.е. не самое большое и не самое маленькое.
         * Если все числа равны, вывести любое из них.**/
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println("среднее число " + a);
        } else if (((a > b) && (a < c)) || ((a > c) && (a < b))) {
            System.out.println("среднее число " + a);
        } else if (((b > a) && (b < c)) || ((b > c) && (b < a))) {
            System.out.println("среднее число " + b);
        } else if (((c > a) && (c < b)) || ((c > b) && (c < a))) {
            System.out.println("среднее число " + c);
        } else {
            System.out.println("введите разные числа");
        }
    }

}
