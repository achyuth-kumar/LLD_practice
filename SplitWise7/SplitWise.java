import java.util.List;

public interface SplitWise {
    public Integer processTransaction(Integer[][] transactions);
    public Integer dfs(Integer ind, List<Integer> balance);
}
