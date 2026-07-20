public class ScoreCalculator {

    public void processRound(
            Team team,
            Circle first,
            Circle second,
            int round) {

        int s1 = first.getScore(round);
        int s2 = second.getScore(round);

        team.getPlayer1().addScore(s1);
        team.getPlayer2().addScore(s2);

        team.addScore(s1 + s2);

        if (first == second && first != Circle.F) {
            team.addBonus(2);
        }
    }
}