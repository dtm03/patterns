package patterns.decoratorPattern;

public class Latte implements Coffee {
    public double getCost() {
        return 2.49;
    }

    public String getIngredients() {
        return "Espresso, Milk";
    }
}
