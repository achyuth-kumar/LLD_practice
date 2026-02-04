public class Main {
    public static void main(String [] args) {
        Player whitePlayer=new Player(1,"Achyuth",Colour.WHITE);
        Player blackPlayer=new Player(2,"Kumar",Colour.BLACK);
        Game chess=new GameServiceImpl(whitePlayer,blackPlayer);
        chess.startGame(new Pawn(Colour.WHITE),1,2,3,3);
    }
}
