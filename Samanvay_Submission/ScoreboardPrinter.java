import java.util.List;

public class ScoreboardPrinter {

    public static void print(int round, List<Team> teams) {

        System.out.println();
        System.out.println("Round " + round);

        System.out.println("Team Scores");
        System.out.println("----------------");

        for (Team t : teams) {
            System.out.println(t.getName() + ": " + t.getTeamScore());
        }

        System.out.println();

        System.out.println("Individual Scores");
        System.out.println("----------------");

        for (Team t : teams) {
            System.out.println(t.getPlayer1().getName() + ": " +
                    t.getPlayer1().getScore());

            System.out.println(t.getPlayer2().getName() + ": " +
                    t.getPlayer2().getScore());
        }

        System.out.println();

        System.out.println("Bonus Points");
        System.out.println("----------------");

        for (Team t : teams) {
            System.out.println(t.getName() + ": " + t.getBonus());
        }

        System.out.println();
    }
}