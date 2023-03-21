package lesson_2.hw_2_task_1_2_3;

public class Main {
    public static void main(String[] args) {
        /**Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
         Вывести на косоль**/
        float Summa = 5.0f;
        float Kassa = 2.0f;
        float SummaVKasse;

        SummaVKasse = Summa / Kassa;
        System.out.println(SummaVKasse + " - Сумма в каждой кассе");


        /**Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
         Вывести на консоль**/
        int Side_a = 50;
        int Side_b = 20;
        int Square;

        Square = Side_a * Side_b;
        System.out.println("Площадь равна " + Square);


        /**Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
         насколько быстрее голодный Вася съедает один банан?
         Вывести на консоль**/
        int TimeEatThreeBananasHungryVasya = 9;
        int AllBananasHungryVasya = 3;
        int TimeEatThreeBananasFullVasya = 15;
        int TimeEatOneBananaHungryVasya, TimeEatOneBananaFullVasya;

        TimeEatOneBananaHungryVasya = TimeEatThreeBananasHungryVasya / AllBananasHungryVasya;
        TimeEatOneBananaFullVasya = TimeEatThreeBananasFullVasya / AllBananasHungryVasya;
        System.out.println("На " + (TimeEatOneBananaFullVasya - TimeEatOneBananaHungryVasya) + " минуты быстрее съедает один банан голодный Вася ");
    }
}