package lesson_11.hw_11.task_1;

public class User {
    private String login;
    private String parol;
    Basket basket;

    public User(String login, String parol, Basket basket) {
        this.login = login;
        this.parol = parol;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель{" +
                "login='" + login + '\'' +
                ", parol='" + parol + '\'' +
                ", basket=" + basket +
                '}';
    }
}
