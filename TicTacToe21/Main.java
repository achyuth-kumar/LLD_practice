public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth",Piece.O);
        Player playerTwo=new Player(2,"Kumar",Piece.X);
        Game ticTacToe=new GameServiceImpl(new Piece[3][3],playerOne,playerTwo,3,3);
        ticTacToe.startGame();
    }
}
