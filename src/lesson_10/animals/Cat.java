package lesson_10.animals;

public class Cat extends Animal{
    private String couch;

    public String getCouch() {
        return couch;
    }

    public void setCouch(String couch) {
        this.couch = couch;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello, I'm cat");
    }
}
