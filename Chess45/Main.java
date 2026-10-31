public class Main {
    public static void main(String[] args) {
        Player blackPlayer=new Player(1,"Achyuth",Colour.black);
        Player whitePlayer=new Player(2,"Kumar",Colour.white);
        Game game=new GameServiceImpl(whitePlayer,blackPlayer,new Cell[8][8],8,8);
        game.startGame(new Pawn(Colour.black),1,1,2,2);
    }
}
