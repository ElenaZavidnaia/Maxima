package lesson_13.hw_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Создай список строк.
         2. Добавь в него 5 различных строк.
         3. Выведи его размер на экран.
         4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.**/

        List<String> arrString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrString.add(scanner.nextLine());
        }

        System.out.println("Размер списка: " + arrString.size());

        for (String item : arrString) {
            System.out.println(item);
        }
    }
}
