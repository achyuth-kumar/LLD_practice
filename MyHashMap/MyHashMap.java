import java.util.*;
public class MyHashMap {
    public static int max_size=10;
    int[] dp=new int[max_size];
    public int isExist(int dp[],int key) {
        for(int i=0;i<max_size;i++) {
            if(dp[i]!=0 && i==key) {
                return i;
            }
        }
        return -1;
    }
    public void put(int k,int v) {
        dp[k]=v;
    }
    public int get(int k) {
        int r=isExist(dp,k);
        if(r!=-1) {
            return dp[k];
        }
        return -1;
    }
}