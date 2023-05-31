package lesson_14.hw_14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**4
         1. Введи с клавиатуры 10 слов в список строк.

         2. Метод doubleValues должен удваивать слова по принципу:
         "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

         3. Выведи результат на экран, каждое значение с новой строки.**/

        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }
        doubleValues(arrayList);
        for (String item : arrayList) {
            System.out.println(item);
        }
    }

    public static List<String> doubleValues(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i += 2) {
            arrayList.add(i + 1, arrayList.get(i));
        }
        return arrayList;
    }
}
