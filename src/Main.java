import patterns.builderPatternWithSeparateClasses.*;
import patterns.decoratorPattern.*;
import patterns.templateMethodPattern.FileProcessor;
import patterns.templateMethodPattern.TextFileProcessor;

public class Main {
    public static void main(String[] args) {
        Game game = new GameBuilder()
            .homeTeam("Dallas Cowboys")
            .awayTeam("New York Giants")
            .currentYardLine(50)
            .stadium("AT&T Stadium")
            .weather("Sunny")
            .build();
        System.out.println(game);
        System.out.println("Game between " + game.getHomeTeam() + " and " + game.getAwayTeam() + " at " +
                game.getStadium() + " with " + game.getWeather() + " weather.");

        // Example for text file processing
        FileProcessor textProcessor = new TextFileProcessor();
        textProcessor.processFile("input.txt", "output.txt");

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