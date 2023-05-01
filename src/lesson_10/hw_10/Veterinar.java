package lesson_10.hw_10;

public class Veterinar {
    public Veterinar() {

    }

    void treatAnimal(Animal animal) {
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }
}
