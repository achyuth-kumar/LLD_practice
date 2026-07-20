import java.util.List;

public class Tournament {

    private final List<Team> teams;
    private final ScoreCalculator calculator = new ScoreCalculator();

    public Tournament(List<Team> teams) {
        this.teams = teams;
    }

    public void play(List<Circle[]> rounds) {

        int round = 1;

        while (true) {

            Circle[] hits = rounds.get(round - 1);

            int index = 0;

            for (Team team : teams) {

                calculator.processRound(
                        team,
                        hits[index++],
                        hits[index++],
                        round
                );
            }

            ScoreboardPrinter.print(round, teams);

            Team winner = findWinner();

            if (winner != null) {
                System.out.println("Game Over. " +
                        winner.getName() +
                        " won!!");
                return;
            }

            round++;
        }
    }

    private Team findWinner() {

        Team winner = null;

        for (Team t : teams) {

            if (t.getTeamScore() >= 60) {

                if (winner == null ||
                        t.getTeamScore() > winner.getTeamScore()) {
                    winner = t;
                }
            }
        }

        return winner;
    }
}