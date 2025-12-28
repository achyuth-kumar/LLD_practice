public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player("Achyuth",1);
        Player playerTwo=new Player("Kumar",2);
        Game game=new GameServiceImpl(playerOne,playerTwo);
        game.StartGame();
    }
}
