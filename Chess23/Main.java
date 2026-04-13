public class Main {
    public static void main(String[] args) {
        Player whitePlayer=new Player(1,"Achyuth",Colour.white);
        Player blackPlayer=new Player(2,"Kumar",Colour.black);
        Game chess=new GameServiceImpl(whitePlayer,blackPlayer,8,8,new Cell[8][8]);
        chess.startGame(new Pawn(Colour.white),1,1,2,2);

    }
}
