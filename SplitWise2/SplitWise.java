import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SplitWise {
    public Integer dfs(int ind,List<Integer> balance) {
        if(balance.size()==0 || ind>=balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        Integer currentValue=balance.get(ind);
        Integer mn=Integer.MAX_VALUE;
        for(int i=ind;i<balance.size();i++) {
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

    public Integer Simplify(Integer [][] transactions) {
          HashMap<Integer,Integer> mpp=new HashMap<>();
          for(Integer [] i: transactions) {
              int from=i[0],to=i[1],amount=i[2];
              mpp.put(from,mpp.getOrDefault(from,0)-amount);
              mpp.put(to,mpp.getOrDefault(to,0)+amount);
          }
          List<Integer> balance=new ArrayList<>();
          for(int amount : mpp.values()) {
              if(amount!=0) {
                  balance.add(amount);
              }
          }
          return dfs(0,balance);
    }
}

