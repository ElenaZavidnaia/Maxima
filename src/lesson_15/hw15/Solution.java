package lesson_15.hw15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        /**Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
         Удалить из множества все числа больше 10.

         Требования:
         •    Программа не должна выводить текст на экран.
         •    Программа не должна считывать значения с клавиатуры.
         •    Класс Solution должен содержать только три метода.
         •    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
         •    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

         public class Solution {
         public static Set<Integer> createSet() {
         // напишите тут ваш код

         }

         public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
         // напишите тут ваш код

         }

         public static void main(String[] args) {

         }
         }**/
        Set<Integer> setInteger = createSet();
        Iterator<Integer> item = setInteger.iterator();
        while (item.hasNext()) {
            System.out.print(item.next() + " ");
        }
        System.out.println();

        removeAllNumbersGreaterThan10(setInteger);

        item = setInteger.iterator();
        while (item.hasNext()) {
            System.out.print(item.next() + " ");
        }
    }

    public static Set<Integer> createSet() {
        Set<Integer> setInteger = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        return setInteger;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> item = set.iterator();
        while (item.hasNext()) {
            if (item.next() > 10) {
                item.remove();
            }
        }
        return set;
    }

}
