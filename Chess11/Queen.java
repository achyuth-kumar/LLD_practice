public class Queen implements Piece{

    public Colour colour;
    public Queen(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean validateMove(Cell[][] board, Cell from, Cell to) {
        Integer rowDiff=Math.abs(from.getRow()-to.getRow());
        Integer colDiff=Math.abs(from.getCol()-to.getCol());
        return (rowDiff==colDiff) || (from.getRow()==to.getRow()) || (from.getCol()==to.getCol());
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }
}
