public class Knight implements Piece {

    public Colour colour;
    public Knight(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        int rowdiff=Math.abs(from.getRow()-to.getRow());
        int coldiff=Math.abs(from.getCol()-to.getCol());
        return (rowdiff==2 && coldiff==1) || (rowdiff==1 && coldiff==2);
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
