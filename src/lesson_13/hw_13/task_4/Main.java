package lesson_13.hw_13.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Создай список строк в методе main.
         2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
         3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.**/

        List<String> arrString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrString.add(0, scanner.nextLine());
        }

        for (String item : arrString) {
            System.out.println(item);
        }
    }
}
