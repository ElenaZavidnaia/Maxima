package lesson_10.animals;

public class Dog extends Animal {
    private String bone;

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello, I'm dog");
    }
}
