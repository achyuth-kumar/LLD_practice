import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWiseServiceImpl implements SplitWise{
    HashMap<Integer,Integer> mpp;
    public SplitWiseServiceImpl(HashMap<Integer, Integer> mpp) {
        this.mpp = mpp;
    }

    @Override
    public Integer processTransaction(Integer[][] transactions) {
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
    public Integer dfs(Integer ind, List<Integer> balance) {
        if(balance.size()==0 || ind>=balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        Integer currentVal=balance.get(ind);
        Integer mn=Integer.MAX_VALUE;
        for(int i=ind;i<balance.size();i++) {
            Integer nextVal=balance.get(i);
            if(currentVal*nextVal<0) {
                balance.set(i,currentVal+nextVal);
                mn= Math.min(mn,1+dfs(ind+1,balance));
                balance.set(i,nextVal);
                if((currentVal+nextVal)==0) {
                    break;
                }
            }
        }
        return mn;
    }
}
