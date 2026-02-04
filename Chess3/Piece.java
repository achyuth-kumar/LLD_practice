public interface Piece {
    public boolean validate(Cell [][]board,Cell from,Cell to);
    public Colour getColour();
}
