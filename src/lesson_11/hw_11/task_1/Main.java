package lesson_11.hw_11.task_1;

public class Main {
    public static void main(String[] args) {
        /**
         * 1

         Создать класс Товар, имеющий переменные имя, цена, рейтинг.
         Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
         Создать класс Basket, содержащий массив купленных товаров.
         Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.**/

        Tovar[] arrVegetables = new Tovar[3];
        Tovar[] arrFruits = new Tovar[3];
        Tovar[] arrKrupi = new Tovar[3];
        Tovar[] tovarInBasket = new Tovar[20];
        Basket basket = new Basket(tovarInBasket);
        User buyer;

        arrVegetables[0] = new Tovar("Огурцы", 120.0, 9.0);
        arrVegetables[1] = new Tovar("Помидоры", 250.0, 8.0);
        arrVegetables[2] = new Tovar("Кабачки", 90.0, 2.0);
        Kategoria vegetables = new Kategoria("Овощи", arrVegetables);

        arrFruits[0] = new Tovar("Яблоки", 80.0, 9.0);
        arrFruits[1] = new Tovar("Груши", 100.0, 7.0);
        arrFruits[2] = new Tovar("Бананы", 50.0, 10.0);
        Kategoria fruits = new Kategoria("Фрукты", arrFruits);

        tovarInBasket[0] = arrVegetables[0];
        tovarInBasket[1] = arrVegetables[1];
        tovarInBasket[2] = arrVegetables[2];
        tovarInBasket[3] = arrFruits[0];
        tovarInBasket[4] = arrFruits[1];


        buyer = new User("покупатель", "1234567890", basket);

        System.out.println(buyer);
    }
}
