import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        Game snakeAndLadder=new GameServiceImpl(new Integer[3][3],3,3,playerOne,playerTwo,new HashMap<>(),new HashMap<>());
        snakeAndLadder.startGame();
    }
}
