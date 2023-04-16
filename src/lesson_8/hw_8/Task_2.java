package lesson_8.hw_8;

import java.util.Scanner;

public class Task_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * 2 - Задачи
         * 1
         * Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.
         *
         * 2
         * Напишите метод, который бы возвращал в консоль:
         * true, если число больше 5
         * и false, если число меньше 5
         *
         * 3
         * Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
         *
         * 4
         * Необходимо написать метод, который бы возводил число в степень. И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
         *
         * 5
         * Условие задачи:
         * Необходимо написать простой консольный калькулятор на Java.
         * Метод int getInt() - должен считывать с консоли целое число и возвращать его
         * Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
         * Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
         * Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.**/

        System.out.println("--------------------------------------------------------");
        task_2_1();
        System.out.println("--------------------------------------------------------");
        task_2_2();
        System.out.println("--------------------------------------------------------");
        task_2_3();
        System.out.println("--------------------------------------------------------");
        task_2_4();
        System.out.println("--------------------------------------------------------");
        System.out.println("Задача 2.5");
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        System.out.println("Результат " + calc(num1, num2, operation));

    }

    static void task_2_1() {
        System.out.println("Задача 2.1");

        System.out.println("Введите число");
        float number = scanner.nextFloat();
        System.out.println("Куб числа " + number + " равен " + threeDegree(number, 3));
    }

    static float threeDegree(float number, int degree) {
        float result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * number;
        }
        return result;
    }

    static void task_2_2() {

        System.out.println("Задача 2.2");

        System.out.println("Введите число");
        float number = scanner.nextFloat();

        if (number > 5.0) {
            System.out.println("true");
        } else if (number < 5.0) {
            System.out.println("false");
        }
        ;
    }

    static void task_2_3() {
        System.out.println("Задача 2.3");

        System.out.println("Введите 1-ое число");
        float number1 = scanner.nextFloat();

        System.out.println("Введите 2-ое число");
        float number2 = scanner.nextFloat();

        if (number1 < number2) {
            System.out.println("Меньшее число " + number1);
        } else if (number2 < number1) {
            System.out.println("Меньшее число " + number2);
        } else {
            System.out.println("Числа равны");
        }
    }

    static void task_2_4() {
        System.out.println("Задача 2.4");

        System.out.println("Введите 1-ое число");
        float number1 = scanner.nextFloat();

        System.out.println("Введите 2-ое число");
        float number2 = scanner.nextFloat();

        System.out.println("Введите степень");
        int threeDegree = scanner.nextInt();

        float result;
        result = threeDegree(number1, threeDegree) + threeDegree(number2, threeDegree);
        System.out.println("Результат " + result);
    }

    // //Метод int getInt() - должен считывать с консоли целое число и возвращать его
    static int getInt() {
        System.out.println("Введите число");
        return (scanner.nextInt());
    }

    static char getOperation() {
        char signOperation;
        do {
            System.out.println("Введите знак операции(+, -, * или /)");
            signOperation = scanner.next().charAt(0);
        }
        while ((signOperation != '+') && (signOperation != '-') && (signOperation != '*') && (signOperation != '/'));
        return signOperation;
    }

    static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
        }
        return result;
    }
}
