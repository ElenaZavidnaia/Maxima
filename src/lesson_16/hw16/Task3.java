package lesson_16.hw16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /**3

         Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
         Новая задача: Программа должна работать не с номерами домов, а с городами:

         Пример ввода:
         Москва
         Ивановы
         Киев
         Петровы
         Лондон
         Абрамовичи

         Лондон

         Пример вывода:
         Абрамовичи

         public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Map<String, String> map = new HashMap<>();
         while (true) {
         String city = reader.readLine();
         if (city.isEmpty()) {
         break;
         }
         String family = reader.readLine();

         map.put(city, family);
         }

         String city = reader.readLine();

         if (map.containsKey(city)) {
         String familyName = map.get(city);
         System.out.println(familyName);
         }
         }**/

        Map<String, Map<String, String>> externMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String city;

        externMap.put("Москва", new HashMap<>(Map.of("Смирновы", "ул.Ленина, д.22")));
        externMap.put("Санкт-Петербург", new HashMap<>(Map.of("Петровы", "ул.1 Мая, д.100")));
        externMap.put("Воронеж", new HashMap<>(Map.of("Ивановы", "ул.Волгоградская д.50")));

        city = scanner.nextLine();
        System.out.println(externMap.get(city).entrySet());
    }
}
