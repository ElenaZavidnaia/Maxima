package lesson_4;

public class Main {
    public static void main(String[] args) {
        //for i

        //Первая часть - объявление переменной i - нижний порог отсчёта
        //Вторая часть - условие выхода из цикла
        //Третья часть - инкрементирование i
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world" + i);
        }

        System.out.println();
        for (int j = 1; j <= 100; j++) {
            if ((j % 2) == 0) System.out.println(j);
        }

        System.out.println();
        for (int j = 50; j <= 150; j++) {
            if ((j % 2) != 0) System.out.println(j);
        }

        System.out.println();
        //Делятся на 3 и на 5 одноременно от 0 до 150
        for (int j = 0; j <= 150; j++) {
            if (((j % 15) == 0) && (j != 0)) System.out.println(j);
        }

        System.out.println();
        //Сложить цифры в диапазоне от 10 до 20
        int Sum = 0;
        for (int i = 10; i <= 20; i++) {
            Sum += i;
        }
        System.out.println(Sum);

        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i > 20) {
                System.out.println(i);
            }
        }


        //while
        int i = 5;

        while (i > 0){
            System.out.println(i);
            i--;
        }
    }
}
