import Pizza.AbstractPizza;
import PizzaStore.AbstractPizzaStore;
import PizzaStore.ChicagoPizzaStore;
import PizzaStore.NYPizzaStore;

public class main {
    public static void main(String[] args) {
        AbstractPizzaStore nyStore = new NYPizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoPizzaStore();

        AbstractPizza nyStylePizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyStylePizza.getName() + "\n");
        
        AbstractPizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoStylePizza.getName() + "\n");
    }
}
