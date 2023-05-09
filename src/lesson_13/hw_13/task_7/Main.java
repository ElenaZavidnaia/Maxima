package lesson_13.hw_13.task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
         Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
         Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
         Порядок объявления списков очень важен.
         1.1 Создай метод printList
         2. Метод printList должен выводить на экран все элементы списка с новой строки.
         3. Используя метод printList выведи эти три списка на экран.
         Сначала тот, который для x%3, потом тот, который для x%2, потом последний.**/

        List<Integer> arrBig = new ArrayList<>(20);
        List<Integer> arrDiv3 = new ArrayList<>();
        List<Integer> arrDiv2 = new ArrayList<>();
        List<Integer> arrOthers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            arrBig.add(scanner.nextInt());
        }

        for (Integer item : arrBig) {
            if (((item % 3) == 0) && ((item % 2) == 0)) {
                arrDiv3.add(item);
                arrDiv2.add(item);
            } else if ((item % 3) == 0) {
                arrDiv3.add(item);
            } else if ((item % 2) == 0) {
                arrDiv2.add(item);
            } else {
                arrOthers.add(item);
            }
        }

        System.out.println("Список для x%3");
        printList(arrDiv3);

        System.out.println("Список для x%2");
        printList(arrDiv2);

        System.out.println("Список для остальных чисел");
        printList(arrOthers);
    }

    static void printList(List<Integer> arr) {
        for (Integer item : arr) {
            System.out.println(item);
        }
    }
}
