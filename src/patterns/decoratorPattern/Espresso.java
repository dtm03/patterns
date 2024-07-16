package patterns.decoratorPattern;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getIngredients() {
        return "Espresso";
    }
}
