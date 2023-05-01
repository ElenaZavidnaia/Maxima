package lesson_10.hw_10;

public class Horse extends Animal{
    private String horse;
    private String noise;

    public Horse(String cat, String noise, String food, String location) {
        super(food, location);
        this.horse = cat;
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.horse + " издаёт звук " + this.noise);
    }

    @Override
    public void eat() {
        System.out.println(this.horse + " ест " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println(this.horse + " спит " + this.getLocation());
    }
}
