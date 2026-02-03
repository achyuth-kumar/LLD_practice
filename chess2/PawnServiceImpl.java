public class PawnServiceImpl implements Piece {

    public Colour colour;
    public PawnServiceImpl(Colour colour) {
        this.colour = colour;
    }
    @Override
    public boolean validateMove(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY,Piece [][] board) {
        if((startX+1)>=board.length || (startY+1)>=board[0].length || (startX-1)<0 || (startY-1)<0) {
            return false;
        }
        if(board[endX][endY]!=null) {
            Piece existingPiece=board[endX][endY];
            if(piece.getColour().equals(existingPiece.getColour())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }


}
