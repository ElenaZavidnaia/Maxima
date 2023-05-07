package lesson_11.hw_11.task_3;

public class Main {
    public static void main(String[] args) {
        /**Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

         Примечание:
         Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

         Пример вывода:
         Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
         Имя: Катя, пол: женский, возраст: 55
         Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня**/

        Human grandfather1 = new Human("Павел", false, 56);
        Human grandmother1 = new Human("Катя", true, 55);

        Human grandfather2 = new Human("Иван", false, 60);
        Human grandmother2 = new Human("Александра", true, 58);

        Human father = new Human("Михаил", false, 25, grandfather2, grandmother2);
        Human mother = new Human("Аня", true, 21, grandfather1, grandmother1);

        Human child1 = new Human("Игорь", false, 2, father, mother);
        Human child2 = new Human("Олег", false, 5, father, mother);
        Human child3 = new Human("Дарья", true, 10, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(mother);
        System.out.println();
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println();
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }
}
