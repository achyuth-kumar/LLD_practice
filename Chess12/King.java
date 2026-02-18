public class King implements Piece{

    public Colour colour;
    public King(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean validateMove(Cell [][]board,Cell from,Cell to) {
        Integer rowDiff=Math.abs(from.getRow()-to.getRow());
        Integer colDiff=Math.abs(from.getCol()-to.getCol());
        return (rowDiff<=1) && (colDiff<=1);
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }
}
