public interface Game {
    public void startGame(Player player,Integer startX,Integer startY,Integer endX,Integer endY);
    public void processTurn(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY);
}
