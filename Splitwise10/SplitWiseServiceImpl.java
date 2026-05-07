import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWiseServiceImpl implements SplitWise{

    HashMap<Integer,Integer> mpp;
    Integer[][] transactions;

    public SplitWiseServiceImpl(HashMap<Integer, Integer> mpp, Integer[][] transactions) {
        this.mpp = mpp;
        this.transactions = transactions;
    }
    @Override
    public Integer processTransactions() {
        for(Integer[] t : transactions) {
            Integer from=t[0],to=t[1],amount=t[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
        List<Integer> balance=new ArrayList<>();
        for(Integer amount : mpp.values()) {
            if(amount!=0) {
                balance.add(amount);
            }
        }
        return dfs(0,balance);
    }

    @Override
    public Integer dfs(Integer index, List<Integer> balance) {
        if(balance.size()==0 || index>=balance.size()) {
            return 0;
        }
        if(balance.get(index)==0) {
            return dfs(index+1,balance);
        }
        Integer currentValue=balance.get(index);
        Integer mn=Integer.MAX_VALUE;
        for(int i=index+1;i<balance.size();i++) {
            Integer nextValue=balance.get(i);
            if((currentValue*nextValue)<0) {
                balance.set(i,currentValue+nextValue);
                mn=Math.min(mn,1+dfs(index+1,balance));
                balance.set(i,nextValue);
                if((currentValue+nextValue)==0) {
                    break;
                }
            }
        }
        return mn;
    }
}
