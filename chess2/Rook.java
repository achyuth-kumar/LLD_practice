public class Rook implements Piece {

    public Colour colour;
    public Rook(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        return (from.getRow()==to.getRow()) || (from.getCol()==to.getCol());
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
