package lesson_6.hw_6;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        /**
         *5
         *
         * 1. Считать 6 строк и заполнить ими массив strings.
         * 2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null"). **/

        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[6];

        for (int i = 0; i < 6; i++) {
            arrayString[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrayString.length - 1; i++) {
            for (int j = i + 1; j < arrayString.length; j++) {
                if ((arrayString[i] != null) && (arrayString[i].equals(arrayString[j]))) {
                    arrayString[j] = null;
                }
            }
        }

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
