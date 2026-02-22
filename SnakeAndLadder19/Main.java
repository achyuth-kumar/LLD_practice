import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
        snakes.put(new Pair<>(2,0),new Pair<>(1,1));
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
        ladders.put(new Pair<>(1,0),new Pair<>(2,1));
        Game snakeAndLadder=new GameServiceImpl(playerOne,playerTwo,snakes,ladders);
        snakeAndLadder.startGame();
    }
}
