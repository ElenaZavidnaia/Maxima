package lesson_11.hw_11.task_1;

public class Tovar {
    private String name;
    private double price;
    private double rating;

    public Tovar(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  "(название = " + name + ", цена = " + price + ", рейтинг = " + rating + ')';
    }
}
