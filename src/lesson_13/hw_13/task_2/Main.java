package lesson_13.hw_13.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Создай список строк.
         2. Считай с клавиатуры 5 строк и добавь в список.
         3. Используя цикл, найди самую длинную строку в списке.
         4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.**/

        List<String> arrString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int lengthStr = 0, temp = 0;

        for (int i = 0; i < 5; i++) {
            arrString.add(scanner.nextLine());
        }

        for (int i = 0; i < arrString.size(); i++) {
            temp = arrString.get(i).length();
            if (temp > lengthStr) {
                lengthStr = temp;
            }
        }

        for (String item : arrString) {
            if (item.length() == lengthStr) {
                System.out.println(item);
            }
        }
    }
}
