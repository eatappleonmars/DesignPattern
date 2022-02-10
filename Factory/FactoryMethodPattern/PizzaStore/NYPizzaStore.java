package PizzaStore;

import Pizza.AbstractPizza;
import Pizza.NYStyleCheesePizza;

public class NYPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(String style) {
        if (style.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
