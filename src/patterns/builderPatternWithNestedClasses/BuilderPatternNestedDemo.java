package patterns.builderPatternWithNestedClasses;

public class BuilderPatternNestedDemo {
    public static void main(String[] args) {
        Game game = new Game.GameBuilder()
                .homeTeam("Dallas Cowboys")
                .awayTeam("New York Giants")
                .currentYardLine(50)
                .stadium("AT&T Stadium")
                .weather("Sunny")
                .build();
        System.out.println(game);
        System.out.println("Game between " + game.getHomeTeam() + " and " + game.getAwayTeam() + " at " +
                game.getStadium() + " with " + game.getWeather() + " weather.");
    }
}
