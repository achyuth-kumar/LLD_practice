public class Game {
    Board board=new Board();
    Colour currentTurn=Colour.WHITE;
    void start() {
        board.intialise();
        board.print();
    }
}
