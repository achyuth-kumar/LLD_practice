public interface Game {
    public void startGame(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY);
    public void processTurn(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY);
    public boolean isCheckmate();
    public boolean isStalemate();
}
