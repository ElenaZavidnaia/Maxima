package lesson_11.hw_11.task_3;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    // Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя


    @Override
    public String toString() {
        String text;
        text = "Имя: " + this.name +
                ", пол: " + (this.gender ? "женский" : "мужской") +
                ", возраст: " + this.age;
        if (this.father != null) {
            text = text + ", отец: " + this.father.name;
        }
        if (this.mother != null) {
            text = text + ", мать: " + this.mother.name;
        }
        return text;
    }
}
