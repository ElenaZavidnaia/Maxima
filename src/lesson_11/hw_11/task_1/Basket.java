package lesson_11.hw_11.task_1;

import java.util.Arrays;

public class Basket {
    private Tovar[] productsInBasket;

    public Basket(Tovar[] productsInBasket) {
        this.productsInBasket = productsInBasket;
    }

    @Override
    public String toString() {
        return Arrays.toString(productsInBasket);
    }
}
