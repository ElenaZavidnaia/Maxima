package lesson_13.hw_13.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Создай список строк.
         2. Добавь в него 5 строк с клавиатуры.
         3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
         4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.**/

        List<String> arrString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrString.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            arrString.add(0, arrString.get(arrString.size() - 1));
            arrString.remove(arrString.size() - 1);
        }

        for (String item : arrString) {
            System.out.println(item);
        }
    }
}
