public class Main {
    public static void main(String []args) {
        Player playerOne=new Player(1,"Achyuth",new Pair<>(0,0));
        Player playerTwo=new Player(2,"Kumar",new Pair<>(0,0));
        Game game=new GameServiceImpl(playerOne,playerTwo);
        game.StartGame();
    }
}
