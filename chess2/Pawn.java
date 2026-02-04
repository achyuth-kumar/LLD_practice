public class Pawn implements Piece {

    public Colour colour;
    public Pawn(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Cell from,Cell to,Cell [][] board) {
        int rowdiff=Math.abs(from.getRow()-to.getRow());
        int coldiff=Math.abs(from.getCol()-to.getCol());
        if(this.getColour()==Colour.WHITE) {
            return (from.getRow()==1 && rowdiff==2 && coldiff==0) ||
                    (rowdiff==1 && coldiff==0) ||
                    (rowdiff==1 && coldiff==1 && board[to.getRow()][to.getCol()]!=null);
        }
        else {
            return (from.getRow()==6 && rowdiff==2 && coldiff==0) ||
                    (rowdiff==1 && coldiff==0) ||
                    (rowdiff==1 && coldiff==1 && board[to.getRow()][to.getCol()]!=null);
        }
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
