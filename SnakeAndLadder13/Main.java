import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
        snakes.put(new Pair<>(2,1),new Pair<>(1,1));
        ladders.put(new Pair<>(1,0),new Pair<>(2,2));
        ladders.put(new Pair<>(0,1),new Pair<>(2,0));
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        Game game=new GameServiceImpl(playerOne,playerTwo,snakes,ladders);
        game.StartGame();
    }
}

