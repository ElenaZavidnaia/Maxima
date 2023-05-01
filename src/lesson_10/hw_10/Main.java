package lesson_10.hw_10;

public class Main {
    public static void main(String[] args) {

        /**Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
         Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
         Dog, Cat, Horse переопределяют методы makeNoise, eat.
         Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
         Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location пришедшего на прием животного.
         В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
         **/

        Dog dog = new Dog("Собака", "Гав", "Кость", "Будка");
        Cat cat = new Cat("Кошка", "Мяу", "Молоко", "Коврик");
        Horse horse = new Horse("Лошадь", "Иго-го", "Трава", "Стойло");
        Veterinar veterinar = new Veterinar();

        Animal[] animals = {dog, cat, horse};

        for (Animal arrFromAnimals : animals) {
            veterinar.treatAnimal(arrFromAnimals);
        }
    }
}
