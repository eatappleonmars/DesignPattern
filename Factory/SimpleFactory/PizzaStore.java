public class PizzaStore {

    public Pizza orderPizza(String type) {
        
        Pizza pizza;

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.out();;
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("greek");
    }
}
