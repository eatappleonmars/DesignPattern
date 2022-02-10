package Pizza;

public class NYStyleCheesePizza extends AbstractPizza {
    
    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        this.toppings.add("Grated Regginao Cheese");
    }
}
