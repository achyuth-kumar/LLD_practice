public interface Piece {
    public boolean validateMove(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY,Piece [][] board);
    public Colour getColour();
}
