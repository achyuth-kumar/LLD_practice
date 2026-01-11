import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SplitWiseServiceImpl implements SplitWise{


    HashMap<Integer,Integer> mpp;
    public SplitWiseServiceImpl() {
        this.mpp = new HashMap<>();
    }
    @Override
    public Integer dfs(Integer ind, List<Integer> balance) {
        if(balance.size()==0 || ind>=balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        Integer CurrentVal=balance.get(ind);
        Integer mn=Integer.MAX_VALUE;
        for(int i=ind+1;i<balance.size();i++) {
            Integer NextVal=balance.get(i);
            if(CurrentVal*NextVal<0) {
                balance.set(i,CurrentVal+NextVal);
                mn=Math.min(mn,1+dfs(ind+1,balance));
                balance.set(i,NextVal);
                if((CurrentVal+NextVal)==0) {
                    break;
                }
            }
        }
        return mn;
    }
    @Override
    public Integer processTransaction(Integer [][] transactions) {
        for(int i=0;i<transactions.length;i++) {
            Integer from=transactions[i][0],to=transactions[i][1],amount=transactions[i][2];
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


}
