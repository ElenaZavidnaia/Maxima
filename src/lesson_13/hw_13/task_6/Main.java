package lesson_13.hw_13.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**1. Создай список строк.
         2. Добавь в него 10 строчек с клавиатуры.
         3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
         Если таких строк несколько, то должны быть учтены самые первые из них.
         4. Выведи на экран строку из п.3. Должна быть выведена одна строка.**/

        List<String> arrString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maxLength = 0, minLength = Integer.MAX_VALUE, itemLength = 0;

        for (int i = 0; i < 10; i++) {
            arrString.add(scanner.nextLine());
        }

        for (String item : arrString) {
            itemLength = item.length();
            if (itemLength > maxLength) {
                maxLength = itemLength;
            } else if (itemLength < minLength) {
                minLength = itemLength;
            }
        }

        for (String item : arrString) {
            if ((item.length() == maxLength) || (item.length() == minLength)) {
                System.out.println(item);
                break;
            }
        }
    }
}
