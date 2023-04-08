package lesson_6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        System.out.println(text);
//        char[] chars = text.toCharArray();
//        String reserve="";

//        for (int i = text.length()-1; i >=0 ; i++) {
//            // reverce
//       }
        //Task 2
        String email = scanner.nextLine();
        if (email.indexOf("@") == -1) {
            System.out.println("Ваш адрес не корректен");
            return;
        }
        //Task 3 Check that '@' is only one
        String[] split = email.split("@");
        if (split.length != 2){
            System.out.println("Ваш адрес не корректен");
            return;
        }
        String part1 = split[0];
        String part2 = split[1];
        if (part1.startsWith(".") || (part2.endsWith("."))){
            System.out.println("Адрес не корректен");
            return;
        }
    }
}
