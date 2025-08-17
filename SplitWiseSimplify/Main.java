import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static int dfs(int ind, List<Integer> balance) {
        if(balance.size()==0 || ind>=balance.size()) {
            return 0;
        }
        if(balance.get(ind)==0) {
            return dfs(ind+1,balance);
        }
        int currentValue=balance.get(ind);
        int mn=Integer.MAX_VALUE;
        for(int i=ind+1;i<balance.size();i++) {
            int nextValue=balance.get(i);
            if(currentValue*nextValue<0) {
                balance.set(i,currentValue+nextValue);
                mn=Math.min(mn,1+dfs(ind+1,balance));
                balance.set(i,nextValue);
                if(nextValue+currentValue==0) {
                    break;
                }
            }
        }
        return mn;
    }
    public static int minTransactions(int[][] transactions) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int [] i : transactions) {
            int from=i[0];
            int to=i[1];
            int amount=i[2];
            mpp.put(from,mpp.getOrDefault(from,0)-amount);
            mpp.put(to,mpp.getOrDefault(to,0)+amount);
        }
        List<Integer> balance=new ArrayList<Integer>();
        for(int amount : mpp.values()) {
            if(amount!=0) {
                balance.add(amount);
            }
        }
        return dfs(0,balance);
    }
    public static void main(String [] args) {
        int [][] transactions=new int[4][3];
        transactions[0][1]=5;
        transactions[1][2]=5;
        transactions[2][0]=10;
        transactions[0][2]=1;
        System.out.println(minTransactions(transactions));
    }

}
