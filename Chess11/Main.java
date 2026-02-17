public class Main {
    public static void main(String [] args) {
        Player WhitePlayer=new Player(1,"Achyuth",Colour.White);
        Player BlackPlayer=new Player(2,"Kumar",Colour.Black);
        Game chess=new GameServiceImpl(WhitePlayer,BlackPlayer);
        chess.startGame(new Pawn(Colour.White),1,1,2,2);
    }
}
