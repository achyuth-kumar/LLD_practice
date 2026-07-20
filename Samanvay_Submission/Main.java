import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();

        teams.add(new Team(
                "Gyrhuna",
                new Player("Janos Diak"),
                new Player("Susu")));

        teams.add(new Team(
                "Achni",
                new Player("Meilong"),
                new Player("Tianlong")));

        teams.add(new Team(
                "Bathar",
                new Player("Pakhangba"),
                new Player("Poubi Lai Paphal")));

        List<Circle[]> rounds = new ArrayList<>();

        rounds.add(new Circle[]{
                Circle.A, Circle.B,
                Circle.C, Circle.D,
                Circle.E, Circle.F
        });

        rounds.add(new Circle[]{
                Circle.A, Circle.B,
                Circle.C, Circle.D,
                Circle.E, Circle.F
        });

        rounds.add(new Circle[]{
                Circle.A, Circle.B,
                Circle.A, Circle.A,
                Circle.A, Circle.A
        });

        rounds.add(new Circle[]{
                Circle.A, Circle.A,
                Circle.A, Circle.B,
                Circle.A, Circle.A
        });

        rounds.add(new Circle[]{
                Circle.B, Circle.C,
                Circle.A, Circle.B,
                Circle.E, Circle.F
        });

        Tournament tournament = new Tournament(teams);
        tournament.play(rounds);
    }
}