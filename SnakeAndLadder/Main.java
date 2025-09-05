public class Main {
    public static void main(String [] args) {
        Board board=new Board();
        Players playeOne= new PlayerOne(new int[][]{{0},{0}},"Achyuth");
        Players playeTwo= new PlayerTwo(new int[][]{{0},{0}},"Kumar");
        Game game=new Game(board, (PlayerOne) playeOne, (PlayerTwo) playeTwo);
        game.SnaKeAndLadder();
    }
}
