import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
        snakes.put(new Pair<>(2,2),new Pair<>(1,1));
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
        ladders.put(new Pair<>(1,2),new Pair<>(2,0));
        Game snakeAndLadder=new GameServiceImpl(new Integer[3][3],3,3,playerOne,playerTwo,snakes,ladders);
        snakeAndLadder.startGame();
    }
}
