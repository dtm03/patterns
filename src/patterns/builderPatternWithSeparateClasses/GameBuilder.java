package patterns.builderPatternWithSeparateClasses;

public class GameBuilder {
    String homeTeam;
    String awayTeam;
    int currentYardLine;
    String stadium;
    String weather;

    // Setters using Fluent Interface Pattern
    public GameBuilder homeTeam(String name) {
        this.homeTeam = name;
        return this;
    }

    public GameBuilder awayTeam(String name) {
        this.awayTeam = name;
        return this;
    }

    public GameBuilder currentYardLine(int yardLine) {
        this.currentYardLine = yardLine;
        return this;
    }

    public GameBuilder stadium(String stadium) {
        this.stadium = stadium;
        return this;
    }

    public GameBuilder weather(String weather) {
        this.weather = weather;
        return this;
    }

    // Build method checks if attributes are set and instantiates Game
    public Game build() {
        if (homeTeam == null) {
            throw new IllegalStateException("Home team is required");
        }
        if (awayTeam == null) {
            throw new IllegalStateException("Away team is required");
        }
        if (currentYardLine < 0) {
            throw new IllegalStateException("Current yard line is required");
        }
        if (stadium == null) {
            throw new IllegalStateException("Stadium is required");
        }
        if (weather == null) {
            throw new IllegalStateException("Weather is required");
        }
        return new Game(this);
    }
}
