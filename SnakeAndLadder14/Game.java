public interface Game {
    public void startGame();
    public void processTurn(Player player,Pair<Integer,Integer> CurrentPosition);
}
