public class Player {

    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void addScore(int points) {
        score += points;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}