package lesson_5;

import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lenina = new int[8];

        for (int i = 0; i < lenina.length; i++) {
            lenina[i] = scanner.nextInt();
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < lenina.length; i++) {
            if ((i % 2) == 0) {
                even += lenina[i];
            } else {
                odd += lenina[i];
            }
        }

        if (even > odd) {
            System.out.println("На чётной стороне улицы живёт больше людей");
        } else if (even < odd) {
            System.out.println("На нечётной стороне улицы живёт больше людей");
        } else {
            System.out.println("Количество людей одинаково");
        }
    }
}
