public class Main {
    public static void main(String [] args) {
        Player playerOne=new Player(1,"Achyuth",Colour.WHITE);
        Player playerTwo=new Player(2,"Kumar",Colour.BLACK);
        Game chess=new GameServiceImpl(playerOne,playerTwo);
        chess.startGame(new Bishop(Colour.WHITE),1,1,2,2);
    }
}
