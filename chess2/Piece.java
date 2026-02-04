public interface Piece {
    public boolean validateMove(Cell from,Cell to,Cell [][] board);
    public Colour getColour();
}
