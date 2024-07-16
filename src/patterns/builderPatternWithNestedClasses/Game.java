package patterns.builderPatternWithNestedClasses;

public class Game {
    private final String awayTeam;
    private final String homeTeam;
    private final int currentYardLine;
    private final String stadium;
    private final String weather;

    // Private constructor to prevent direct instantiation
    private Game(GameBuilder builder) {
        this.awayTeam = builder.awayTeam;
        this.homeTeam = builder.homeTeam;
        this.currentYardLine = builder.currentYardLine;
        this.stadium = builder.stadium;
        this.weather = builder.weather;
    }

    // Getters
    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
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

    // Static nested Builder class
    public static final class GameBuilder {
        private String awayTeam;
        private String homeTeam;
        private int currentYardLine;
        private String stadium;
        private String weather;

        // Setters using Fluent Interface Pattern
        public GameBuilder awayTeam(String awayTeam) {
            this.awayTeam = awayTeam;
            return this;
        }

        public GameBuilder homeTeam(String homeTeam) {
            this.homeTeam = homeTeam;
            return this;
        }

        public GameBuilder currentYardLine(int currentYardLine) {
            this.currentYardLine = currentYardLine;
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

        // Method to build and return the Game instance
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
}

