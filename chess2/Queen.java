public class Queen implements Piece {

    public Colour colour;
    public Queen(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        int rowdiff=Math.abs(from.getRow()-to.getRow());
        int coldiff=Math.abs(from.getCol()-to.getCol());
        return (rowdiff==coldiff) || (from.getRow()==to.getRow()) || (from.getCol()==to.getCol());
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
