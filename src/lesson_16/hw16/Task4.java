package lesson_16.hw16;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        /**4

         Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
         арбуз - ягода,
         банан - трава,
         вишня - ягода,
         груша - фрукт,
         дыня - овощ,
         ежевика - куст,
         жень-шень - корень,
         земляника - ягода,
         ирис - цветок,
         картофель - клубень.
         Вывести содержимое коллекции на экран, каждый элемент с новой строки.

         Пример вывода (тут показана только одна строка):
         картофель - клубень**/

        Map<String, String> vegetables = new HashMap<>(Map.ofEntries(Map.entry("арбуз","ягода"),
                Map.entry("банан","трава"),
                Map.entry("вишня","ягода"),
                Map.entry("груша","фрукт"),
                Map.entry("дыня","овощ"),
                Map.entry("ежевика","куст"),
                Map.entry("жень-шень","корень"),
                Map.entry("земляника","ягода"),
                Map.entry("ирис","цветок"),
                Map.entry("картофель","клубень")));

        for (Map.Entry<String, String> item : vegetables.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
