public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth",Piece.O);
        Player playerTwo=new Player(2,"Kumar",Piece.X);
        Game game=new GameServiceImpl(playerOne,playerTwo);
        game.startGame();
    }
}
