package patterns.builderPatternWithSeparateClasses;

public class Game {
    private final String homeTeam;
    private final String awayTeam;
    private final int currentYardLine;
    private final String stadium;
    private final String weather;

    // Public constructor to instantiate Game using GameBuilder
    public Game(GameBuilder builder) {
        awayTeam = builder.awayTeam;
        homeTeam = builder.homeTeam;
        currentYardLine = builder.currentYardLine;
        stadium = builder.stadium;
        weather = builder.weather;
    }

    // Getters
    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getCurrentYardLine() {
        return currentYardLine;
    }

    public String getStadium() {
        return stadium;
    }

    public String getWeather() {
        return weather;
    }
}
