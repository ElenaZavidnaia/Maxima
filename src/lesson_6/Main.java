package lesson_6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 - Примитивные типы
        //2 - Ссылочные типы Oracle
        //3 - Ссылочные типы собственные

        String s = "Hello World";

        /**
         * length() - возвращает длину строки
         *
         * concat(): объединяет строки / +=
         *
         * equals(): сравнивает строки с учетом регистра
         *
         * equalsIgnoreCase(): сравнивает строки без учета регистра
         *
         * startsWith(): определяет, начинается ли строка с подстроки
         *
         * endsWith(): определяет, заканчивается ли строка на определенную подстроку
         *
         * String replace(char oldChar, char newChar)
         * Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.
         *
         * String[] split(String regex)
         * Разделяет эту строку, окружая данным регулярным выражением.
         *
         * trim(): удаляет начальные и конечные пробелы
         *
         * toLowerCase(): переводит все символы строки в нижний регистр
         *
         * toUpperCase(): переводит все символы строки в верхний регистр**/

        String st = "Hello World!";
        System.out.println(st.length());


        String st1 = st.concat("!!!!!!!!!!!");
        System.out.println(st1);
        st1+="???????????";


        int a = 5;
        int b = 10;
        String stt="Hello World!";
        System.out.println(st.equals(stt));

        System.out.println(stt.startsWith("Hello"));
        System.out.println(st1.endsWith("!"));

        String newSt1 = st1.replace("?","!");
        System.out.println(newSt1);

        String st3="Hello World ";
        String trim = st3.trim();
        System.out.println(trim);

        String stringForExampleLowerCase="hello World";
        //stringForExampleLowerCase.toUpperCase(Locale.ROOT);

    }
}
