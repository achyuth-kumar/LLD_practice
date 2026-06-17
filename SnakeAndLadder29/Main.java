import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> snakes=new HashMap<>();
        HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> ladders=new HashMap<>();
        snakes.put(new Pair<>(2,1),new Pair<>(0,1));
        ladders.put(new Pair<>(1,1),new Pair<>(2,0));
        Game game=new GameServiceImpl(playerOne,playerTwo,new Integer[3][3],3,3,snakes,ladders);
        game.startGame();
    }
}
