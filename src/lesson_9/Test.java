package lesson_9;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("Step " + i);
        }

        int a = 0;

        while (a < 9) {
            System.out.println("Step " + a);
            a++;
        }

        do {
            System.out.println("Step " + a);
            a++;
        } while (a < 9);
    }
}
