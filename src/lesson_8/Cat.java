package lesson_8;

public class Cat {
    // поля
    String name;
    Integer age;

    // конструктор

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }
//МЕТОДЫ
    public void sayHello(String name, int age) {
        System.out.println("I'm the cat");
        System.out.println("My name is" + name);
        System.out.println("My age is" + age);
        System.out.println("My age is 10");
    }

    public void sayGoodBye() {
        System.out.println("GoodBye");
    }

    public int giveMeFive() {
        System.out.println("Inside method giveMeFive");
        int a = 5;
        System.out.println("going outside of method giveMeFive");
        return a;
    }

    public double giveMePiNumber() {
        return (3.14159265359);
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public String getNull() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
