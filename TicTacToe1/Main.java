public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(0,"Achyuth",Piece.O);
        Player playerTwo=new Player(1,"Kumar",Piece.X);
        GameBoard gameBoard=new GameBoard();
        gameBoard.Game(playerOne,playerTwo);

    }
}
