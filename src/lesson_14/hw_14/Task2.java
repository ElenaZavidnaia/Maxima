package lesson_14.hw_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /**2
         1. Создай список из слов "мама", "мыла", "раму".
         2. После каждого слова вставь в список строку, содержащую слово "именно".
         3. Вывести результат на экран, каждый элемент списка с новой строки.**/

        List<String> arrayString = new ArrayList<>();
        arrayString.add("мама");
        arrayString.add("мыла");
        arrayString.add("раму");

        arrayString.add(1, "именно");
        arrayString.add(3, "именно");
        arrayString.add(5, "именно");

        Iterator<String> itr = arrayString.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
