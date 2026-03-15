public class Main {
    public static void main(String[] args) {
        Player whitePlayer=new Player(1,"Achyuth",Colour.White);
        Player blackPlayer=new Player(2,"Kumar",Colour.Black);
        Game chess=new GameServiceImpl(whitePlayer,blackPlayer,new Cell[8][8],8,8);
        chess.startGame(new Pawn(Colour.White),1,1,2,2);
    }
}
