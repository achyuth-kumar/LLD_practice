public class King implements Piece {

    public Colour colour;
    public King(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        int rowdiff=Math.abs(from.getRow()-to.getRow());
        int coldiff=Math.abs(from.getCol()-to.getCol());
        return (rowdiff<=1) || (coldiff<=1);
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
