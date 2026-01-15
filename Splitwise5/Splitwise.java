import java.util.List;

public interface Splitwise {
    public Integer processPayment(Integer [][]transactions);
    public Integer dfs(Integer ind, List<Integer> balance);
}
