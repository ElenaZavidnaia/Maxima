package lesson_14.hw_14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1  Введи с клавиатуры 5 слов в список строк.
        //   Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        List<String> arrayString = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayString.add(scanner.nextLine());
        }
        arrayString.remove(2);

        ListIterator<String> itr = arrayString.listIterator(arrayString.size());

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
