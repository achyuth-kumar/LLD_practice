public class Bishop implements Piece {

    public Colour colour;
    public Bishop(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        int rowdiff=Math.abs(from.getRow()-to.getRow());
        int coldiff=Math.abs(from.getCol()-to.getCol());
        return rowdiff==coldiff;
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
