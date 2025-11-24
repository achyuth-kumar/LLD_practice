public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth");
        Player playerTwo=new Player(2,"Kumar");
        Game game=new GameServiceImpl(playerOne,playerTwo);
        game.SnakeAndLadder();
    }
}
