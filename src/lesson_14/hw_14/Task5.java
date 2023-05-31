package lesson_14.hw_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /**5
         1. Введи с клавиатуры 10 слов в список строк.
         2. Определить, является ли список упорядоченным по возрастанию длины строки.
         3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.**/

        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();
        int lengthItem = 0, lengthItemSave = 0;
        boolean result = true;

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }

        for (int i = 0; i < 10; i++) {
            lengthItem = arrayList.get(i).length();
            if (lengthItem < lengthItemSave) {
                System.out.println("Список не упорядочен:  " + i);
                result = false;
                break;
            }
            lengthItemSave = lengthItem;
        }
        if (result) {
            System.out.println("Список упорядочен");
        }
    }
}
