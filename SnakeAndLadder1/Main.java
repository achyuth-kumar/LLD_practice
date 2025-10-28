import Pair.Pair;

public class Main {
    public static void main(String [] args) {
        Player player1=new Player(1,"Achyuth",new Pair<Integer,Integer>(0,0));
        Player player2=new Player(2,"Kumar",new Pair<Integer,Integer>(0,0));
        Game game=new Game(player1,player2);
        game.SnakeAndLadder();
    }
}
