package lesson_10.hw_10;

public class Cat extends Animal {
    private String cat;
    private String noise;

    public Cat(String cat, String noise, String food, String location) {
        super(food, location);
        this.cat = cat;
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.cat + " издаёт звук " + this.noise);
    }

    @Override
    public void eat() {
        System.out.println(this.cat + " ест " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println(this.cat + " спит " + this.getLocation());
    }
}
