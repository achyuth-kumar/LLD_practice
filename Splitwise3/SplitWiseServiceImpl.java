import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SplitWiseServiceImpl implements SplitWise{
    Integer [][]transactions;
    HashMap<Integer,Integer> mpp;
    List<Integer> Balance;
    public SplitWiseServiceImpl() {
        this.transactions= new Integer[][]{{1, 2, 100}, {2, 3, 80}, {3, 1, 20}};
        this.mpp = new HashMap<>();
        this.Balance=new ArrayList<>();
    }


    @Override
    public Integer build() {
        for(Integer[] i : transactions) {
            Integer from=i[0],to=i[1],amount=i[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
        for(Integer amount : mpp.values()) {
            if(amount!=0) {
                Balance.add(amount);
            }
        }
        return dfs(0,Balance);
    }

    @Override
    public Integer dfs(Integer ind, List<Integer> balance) {
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
                mn=Math.min(mn,1+dfs(ind+1,balance));
                balance.set(i,nextValue);
                if(currentValue+nextValue==0) {
                    break;
                }
            }
        }
        return mn;
    }
}
