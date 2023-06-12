package lesson_16.hw16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /**2
         Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
         Используй коллекции.**/

        String month;
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> calendar = new HashMap<>(Map.ofEntries(Map.entry("Январь", 1),
                Map.entry("Февраль", 2),
                Map.entry("Март", 3),
                Map.entry("Апрель", 4),
                Map.entry("Май", 5),
                Map.entry("Июнь", 6),
                Map.entry("Июль", 7),
                Map.entry("Август", 8),
                Map.entry("Сентябрь", 9),
                Map.entry("Октябрь", 10),
                Map.entry("Ноябрь", 11),
                Map.entry("Декабрь", 12)));

        month = scanner.nextLine();
        System.out.println(month + " is the " + calendar.get(month) + " month");
        /*
          for (Map.Entry<String, Integer> item : calendar.entrySet()) {
            if (month.compareToIgnoreCase(item.getKey()) == 0)
             {
                System.out.println(item.getKey() + " is the " + item.getValue() + " month");
            }
        }*/
    }
}
