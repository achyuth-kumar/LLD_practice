
public interface Game {
    public void StartGame();
    public void ProcessTurn(Player player , Pair<Integer, Integer> CurrentPosition);
}
