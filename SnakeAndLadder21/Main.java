import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
        HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
        snakes.put(new Pair<>(2,0),new Pair<>(1,1));
        ladders.put(new Pair<>(0,1),new Pair<>(2,2));
        Integer [][]board=new Integer[3][3];
        Game snakeAndLadder=new GameServiceImpl(playerOne,playerTwo,3,3,board,snakes,ladders);
        snakeAndLadder.startGame();
    }
}
