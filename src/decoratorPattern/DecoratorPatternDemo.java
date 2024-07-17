package decoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a simple Espresso
        Coffee espresso = new Espresso();
        System.out.println("Cost: $" + espresso.getCost() + ", Ingredients: " + espresso.getIngredients());

        // Decorate with Milk
        Coffee milkEspresso = new MilkDecorator(espresso);
        System.out.println("Cost: $" + milkEspresso.getCost() + ", Ingredients: " + milkEspresso.getIngredients());

        // Decorate with Sugar
        Coffee milkSugarEspresso = new SugarDecorator(milkEspresso);
        System.out.println("Cost: $" + String.format("%.2f",milkSugarEspresso.getCost()) + ", Ingredients: " + milkSugarEspresso.getIngredients());

        // Create a Latte with Milk and Sugar
        Coffee latte = new Latte();
        Coffee latteWithMilkAndSugar = new SugarDecorator(new MilkDecorator(latte));
        System.out.println("Cost: $" + String.format("%.2f",latteWithMilkAndSugar.getCost())  + ", Ingredients: " + latteWithMilkAndSugar.getIngredients());
    }
}
