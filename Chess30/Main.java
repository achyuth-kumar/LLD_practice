public class Main {
    public static void main(String[] args) {
        Player blackPlayer=new Player(1,"Achyuth",Colour.Black);
        Player whitePlayer=new Player(2,"Kumar",Colour.White);
        Game chess=new GameServiceImpl(blackPlayer,whitePlayer,new Cell[8][8],8,8);
        chess.startGame(new Pawn(Colour.White),1,2,2,2);
    }
}
