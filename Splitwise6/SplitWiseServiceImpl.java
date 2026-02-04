import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWiseServiceImpl implements SplitWise{
    Integer m,n;
    Integer[][] transactions;
    HashMap<Integer,Integer> mpp;
    public SplitWiseServiceImpl(Integer [][] transactions) {
        this.transactions = transactions;
        mpp=new HashMap<>();
    }
    @Override
    public Integer processTransactions() {
        for(Integer[] i : transactions) {
            Integer from=i[0],to=i[1],amount=i[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
        List<Integer> balance=new ArrayList<>();
        for(Integer amount : mpp.values()) {
            if(amount!=null) {
                balance.add(amount);
            }
        }
        return dfs(0,balance);
    }

    @Override
    public Integer dfs(Integer ind,List<Integer> balance) {
        if(balance.size()==0 || ind>=balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        Integer currentValue=balance.get(ind);
        Integer mn=Integer.MAX_VALUE;
        for(int i=ind+1;i<balance.size();i++) {
            Integer nextValue=balance.get(i);
            if(currentValue*nextValue<0) {
                balance.set(i,currentValue+nextValue);
                mn= Math.min(mn,1+dfs(ind+1,balance));
                balance.set(i,nextValue);
                if((currentValue+nextValue)==0) {
                    break;
                }
            }
        }
        return mn;
    }
}
