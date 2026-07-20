public class Team {

    private final String name;
    private final Player player1;
    private final Player player2;

    private int teamScore;
    private int bonus;

    public Team(String name, Player p1, Player p2) {
        this.name = name;
        this.player1 = p1;
        this.player2 = p2;
    }

    public void addScore(int score) {
        teamScore += score;
    }

    public void addBonus(int points) {
        bonus += points;
        teamScore += points;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getBonus() {
        return bonus;
    }
}