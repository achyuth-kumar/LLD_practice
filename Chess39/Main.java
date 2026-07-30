public class Main {
    public static void main(String[] args) {
        Player WhitePlayer=new Player(1,"Achyuth",Colour.white);
        Player BlackPlayer=new Player(2,"Kumar",Colour.black);
        Game chess=new GameServiceImpl(new Cell[8][8],8,8,WhitePlayer,BlackPlayer);
        chess.startGame(new Rook(Colour.white),1,1,2,2);

    }
}
