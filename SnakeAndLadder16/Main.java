import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth");
        Player playerTwo=new Player(2,"Kumar");
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
        snakes.put(new Pair<>(1,0),new Pair<>(2,1));
        ladders.put(new Pair<>(1,1),new Pair<>(2,0));
        Game snakeAndLadder=new GameServiceImpl(playerOne,playerTwo,snakes,ladders);
        snakeAndLadder.startGame();
    }
}
