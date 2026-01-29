public class Main {
    public static void main(String[] args) {
        Player playerOne=new Player(1,"Achyuth",Piece.O);
        Player playerTwo=new Player(2,"Kumar",Piece.X);
        game ticTacToe=new gameServiceImpl(playerOne,playerTwo);
        ticTacToe.startGame();
    }
}
