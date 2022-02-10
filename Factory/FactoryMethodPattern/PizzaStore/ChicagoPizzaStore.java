package PizzaStore;

import Pizza.AbstractPizza;
import Pizza.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(String style) {
        if (style.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
