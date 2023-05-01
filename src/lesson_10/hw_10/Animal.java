package lesson_10.hw_10;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.print("издаёт звук ");
    }

    public void eat() {
        System.out.print("любит есть ");
    }

    public void sleep() {
        System.out.println("спит ");
    }
}
