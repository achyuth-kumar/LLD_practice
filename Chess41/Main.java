public class Main {
    public static void main(String[] args) {
         Player whitePlayer=new Player(1,"Achyuth",Colour.white);
         Player blackPlayer=new Player(2,"Kumar",Colour.black);
         Game game=new GameServiceImpl(whitePlayer,blackPlayer,new Cell[8][8],8,8);
         game.startGame(new Rook(Colour.white),1,1,2,2);


    }
}
