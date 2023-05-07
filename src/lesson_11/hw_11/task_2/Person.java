package lesson_11.hw_11.task_2;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(this);
    }
    public void talk(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "fullName='" + fullName + ", age=" + age + " говорит";
    }
}
