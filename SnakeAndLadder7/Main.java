public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth");
        Player playerTwo=new Player(1,"Kumar");
        Game game=new Game(playerOne,playerTwo);
        game.SnakeAndLadder();
    }
}
