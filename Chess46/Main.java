public class Main {
    public static void main(String[] args) {
        Player blackPlayer=new Player(1,"Achyuth",Colour.Black);
        Player whitePlayer=new Player(2,"Kumar",Colour.White);
        Game game=new GameServiceImpl(new Cell[8][8],8,8,whitePlayer,blackPlayer);
        game.startGame(new Rook(Colour.Black),1,1,2,2);
    }
}
