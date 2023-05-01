package lesson_10.hw_10;

public class Dog extends Animal {
    private String dog;
    private String noise;

    public Dog(String dog, String noise, String food, String location) {
        super(food, location);
        this.dog = dog;
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.dog + " издаёт звук " + this.noise);
    }

    @Override
    public void eat() {
        System.out.println(this.dog + " ест " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println(this.dog + " спит " + this.getLocation());
    }
}
