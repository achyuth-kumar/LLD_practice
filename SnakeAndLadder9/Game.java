import Pair.Pair;

public interface Game {
    public void processTurn(Pair<Integer,Integer> currentIndex, Player player);
    public void SnakeAndLadder();
}
