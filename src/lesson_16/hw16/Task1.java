package lesson_16.hw16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /**1
         1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
         2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
         3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
         4. Вывести содержимое Map на экран.**/
        Map<String, String> dictionary = createMap();

        dictionary.put("Петров2", "Иван10");
        dictionary.put("Петров10", "Иван1");

        printScreen(dictionary);
    }

    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<String, String>();

        for (int i = 0; i < 8; i++) {
            people.put("Петров" + i, "Иван" + i);
        }
        return people;
    }

    public static void printScreen(Map<String, String> people) {
        for (Map.Entry<String, String> item : people.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
