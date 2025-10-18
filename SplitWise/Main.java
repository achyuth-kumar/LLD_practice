import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static int dfs(int ind,List<Integer> balance) {
        if (balance.size() == 0 || ind >= balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        int currentVal=balance.get(ind);
        int mn=Integer.MAX_VALUE;
        for(int i=ind;i<balance.size();i++) {
            int nextVal=balance.get(i);
            if(currentVal*nextVal<0) {
                balance.set(i,currentVal+nextVal);
                mn=Math.min(mn,1+dfs(i+1,balance));
                balance.set(i,nextVal);
                if(currentVal+nextVal==0) {
                    break;
                }
            }
        }
        return mn;
    }
    public static void main(String [] args) {
        int transactions[][]={{0,1,5},{1,2,5},{2,0,10},{0,2,1}};
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<transactions.length;i++) {
            int t[] =transactions[i];
            int from=t[0],to=t[1],amount=t[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
        List<Integer> balance=new ArrayList<>();
        for(int amount : mpp.values()) {
            if(amount!=0) {
                balance.add(amount);
            }
        }
        System.out.println("result : "+dfs(0,balance));
    }

}
