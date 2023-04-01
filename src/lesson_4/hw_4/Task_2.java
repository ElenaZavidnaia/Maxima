package lesson_4.hw_4;

public class Task_2 {
    public static void main(String[] args) {
        /**
         *2
         * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
         *
         * Пример вывода на экран:
         * 8
         * 88
         * 888
         * 8888
         * 88888
         * 888888
         * 8888888
         * 88888888
         * 888888888
         * 8888888888 **/

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
