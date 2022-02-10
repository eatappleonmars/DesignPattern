package PizzaStore;

import Pizza.AbstractPizza;

/**
 * Base class provides the behavioral template
 */
public abstract class AbstractPizzaStore {
    
    public AbstractPizza orderPizza(String type) {
    
        AbstractPizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * This is the factory method, core element in factory method pattern.
     * Child class overrides the method telling how to actually create the pizza.
     */
    protected abstract AbstractPizza createPizza(String type);
}
