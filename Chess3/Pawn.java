import java.awt.event.MouseAdapter;

public class Pawn implements Piece{

    public Colour colour;
    public Pawn(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean validate(Cell [][]board,Cell from,Cell to) {
        Integer rowDiff= Math.abs(from.getRow()-to.getRow());
        Integer colDiff= Math.abs(from.getCol()-to.getCol());
        if(getColour()==Colour.WHITE) {
            return (from.getRow()==1 && rowDiff==2 && colDiff==0) ||
                    (rowDiff==1 && colDiff==0) ||
                    (rowDiff==1 && colDiff==1 && board[to.getRow()][to.getCol()]!=null);
        }
        else {
            return (from.getRow()==6 && rowDiff==2 && colDiff==0) ||
                    (rowDiff==1 && colDiff==0) ||
                    (rowDiff==1 && colDiff==1 && board[to.getRow()][to.getCol()]!=null);
        }
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }
}
