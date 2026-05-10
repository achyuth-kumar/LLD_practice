import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SplitwiseServiceImpl implements Splitwise{

    Integer[][] transactions;
    HashMap<Integer,Integer> mpp;
    public SplitwiseServiceImpl(Integer[][] transactions, HashMap<Integer, Integer> mpp) {
        this.transactions = transactions;
        this.mpp = mpp;
    }
    @Override
    public Integer processTransactions() {
        List<Integer> balance=new ArrayList<>();
        for(Integer[] t : transactions) {
            Integer from=t[0],to=t[1],amount=t[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
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
        Integer currentValue= balance.get(index);
        Integer mn=Integer.MAX_VALUE;
        for(int i=index;i<balance.size();i++) {
            Integer nextValue= balance.get(i);
            if(currentValue*nextValue<0) {
                balance.set(i,currentValue+nextValue);
                mn=Math.min(mn,1+dfs(index+1,balance));
                balance.set(i,nextValue);
                if(currentValue+nextValue==0) {
                    break;
                }
            }
        }
        return mn;
    }
}
