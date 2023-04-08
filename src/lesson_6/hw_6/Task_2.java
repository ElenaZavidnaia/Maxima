package lesson_6.hw_6;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /**
         *2
         *
         * Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину. **/

        Scanner scanner = new Scanner(System.in);
        String[] dataString = new String[5];
        String dataLongString = "", dataShortString = "";
        int lengthShortString = Integer.MAX_VALUE, lengthLongString = Integer.MIN_VALUE, tmp;

        for (int i = 0; i < 5; i++) {
            dataString[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            tmp = dataString[i].length();
            if (lengthShortString > tmp) {
                lengthShortString = tmp;
                dataShortString = dataString[i];
            } else if (lengthLongString < tmp) {
                lengthLongString = tmp;
                dataLongString = dataString[i];
            }
        }

        System.out.println("Самая короткая строка " + dataShortString + " длиной " + lengthShortString);
        System.out.println("Самая длинная строка " + dataLongString + " длиной " + lengthLongString);
    }
}
