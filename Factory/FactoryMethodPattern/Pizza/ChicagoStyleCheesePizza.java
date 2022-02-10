package Pizza;

public class ChicagoStyleCheesePizza extends AbstractPizza {
    
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Deep Dish and Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        this.toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slcies");
    }
}
