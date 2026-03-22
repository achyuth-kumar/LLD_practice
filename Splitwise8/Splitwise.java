import java.util.List;

public interface Splitwise {
    public Integer processTransaction();
    public Integer dfs(Integer index, List<Integer> balance);
}
