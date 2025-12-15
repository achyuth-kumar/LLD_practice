import Pair.Pair;

public interface Game {
    public void ProcessTurn(Pair<Integer,Integer> currentIndex, Player player);
    public void SnakeAndLadder();
}
