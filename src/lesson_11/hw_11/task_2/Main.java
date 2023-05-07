package lesson_11.hw_11.task_2;

public class Main {
    public static void main(String[] args) {
        /**Создать класс Person, который содержит:

         переменные fullName, age;
         методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
         Добавьте два конструктора  - Person() и Person(fullName, age).
         Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).**/

        Person Ivan = new Person();
        Ivan.talk();

        Person Petr = new Person("Петр Иванович", 25);
        Petr.talk();
    }
}
