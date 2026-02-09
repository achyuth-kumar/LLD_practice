public class Knight implements Piece{
    public Colour colour;
    public Knight(Colour colour) {
        this.colour=colour;
    }

    @Override
    public boolean validateMove(Cell [][] board,Cell from,Cell to) {
        Integer rowDiff=Math.abs(from.getRow()-to.getRow());
        Integer colDiff=Math.abs(from.getCol()-to.getCol());
        return (rowDiff==2 && colDiff==1) || (rowDiff==1 && colDiff==2);
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
