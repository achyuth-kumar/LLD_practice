public class Rook implements Piece{

    public Colour colour;
    public Rook(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell [][]board,Cell from,Cell to) {
        Integer rowDiff=Math.abs(from.getRow()-to.getRow());
        Integer colDiff=Math.abs(from.getCol()-to.getCol());
        return (from.getRow()==to.getRow())|| (from.getCol()==to.getCol());
    }

    @Override
    public Colour getColour() {
        return null;
    }
}
