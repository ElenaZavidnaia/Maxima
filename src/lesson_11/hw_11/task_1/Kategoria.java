package lesson_11.hw_11.task_1;

import java.util.Arrays;

public class Kategoria {
    private String name;
    private Tovar[] tovars;

    public Kategoria(String name, Tovar[] tovars) {
        this.name = name;
        this.tovars = tovars;
    }

    @Override
    public String toString() {
        return "Kategoria{" +
                "name='" + name + '\'' +
                ", tovars=" + Arrays.toString(this.tovars) +
                '}';
    }
}

