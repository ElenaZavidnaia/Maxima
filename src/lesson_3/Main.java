package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         Арифметические операторы
         + Складывает значения по обе стороны от оператора
         - Вычитает правый операнд из левого операнда
         * Умножает значения по обе стороны от оператора
         / Оператор деления делит левый операнд на правый операнд
         % Делит левый операнд на правый операнд и возвращает остаток
         ++ Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         -- Декремент - уменьшает значение операнда на 1 х-- постфиксная, --х префиксная
         **/
        int a = 10 * 10;
        System.out.println(a);

        int b = 10 % 3; //10 = (9/3)+1
        System.out.println(b);

        int c = 7;
        c++;//c=c+1
        System.out.println(c);

        c--;//c=c-1
        System.out.println(c);

        /**
         * Операторы сравнения
         *
         * == Проверяет, равны или нет значения двух операндов, если да,
         *  то условие становится истинным (A == B) – не верны
         *
         *          != Проверяет, равны или нет значения двух операндов,
         *          если значения не равны, то условие становится истинным (A != B) – значение истинна
         *
         *          > Проверяет, является ли значение левого операнда больше,
         *          чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны
         *
         *          < Проверяет, является ли значение левого операнда меньше,
         *          чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна
         *
         *          >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         *          если да, то условие становится истинным (A >= B) – значение не верны
         *
         *          <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         *          если да, то условие становится истинным (A <= B) – значение истинна
         *          **/

        boolean bool = 10 >= 5;
        System.out.println(bool);

        /**
         *  Логические операторы
         *
         * && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         * || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         * ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         *  Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         **/

        boolean bool2 = 10 == 5 && 10 > 6 && 10 > 7;
        System.out.println(bool2);

        boolean bool3 = 10 == 5 || 10 > 6;
        System.out.println(bool3);

        boolean bool4 = 10 == 5 || 10 > 6;
        System.out.println(!bool4);

        //Операторы присвоения
        // += с инкрементированием
        // *= с инкрементированием
        // /= с инкрементированием
        // -= с инкрементированием

        int f = 10;
        f += 5;//f=f+5;
        System.out.println(f);

        /**
         * if (условие) {
         * //действие(-я), которые выполняются, если условие истинно;
         * }
         * else if (условие) {
         * //действие(-я), которые выполняются, если условие истинно;
         * }
         * else if (условие) {
         * //действие(-я), которые выполняются, если условие истинно;
         * }
         * else {
         * //действие(-я), которые выполняются, если условие истинно;
         * }
         * **/

        int age = 15;
        if (age >= 13) {
            System.out.println("Your age is ok");
        } else if (age < 13) {
            System.out.println("No, you can't go to the film");
        }


        int mathRate = 7;
        if (mathRate == 5) {
            System.out.println("Отлично");
        } else if (mathRate == 4) {
            System.out.println("Хорошо");
        } else if (mathRate == 3) {
            System.out.println("Удовлетворительно");
        } else if (mathRate == 2) {
            System.out.println("Плохо");
        } else if (mathRate == 1) {
            System.out.println("Отвратительно");
        } else {
            System.out.println("Такой оценки не существует");
        }


        /**
         *switch (ВыражениеДляВыбора) {
         * case (Значение1):
         * Код1;
         * break;
         * case (Значение2):
         * Код2;
         * break;
         * ...
         * case (ЗначениеN):
         * КодN;
         * break;
         * default:
         * КодВыбораПоУмолчанию;
         * break;
         * }
         * **/

        switch (mathRate) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
                System.out.println("Плохо");
                break;
            case 1:
                System.out.println("Отвратительно");
                break;
            default:
                System.out.println("Такой оценки не существует");
                break;
        }

        Scanner scan = new Scanner(System.in);
        int fromConsole = scan.nextInt();
        switch (fromConsole) {
            case 30:
                System.out.println("Жарковато");
                break;
            case 15:
                System.out.println("Тепло");
                break;
            case -10:
                System.out.println("Холодно");
                break;
            default:
                System.out.println("Погода не известная");
                break;
        }

    }
}
