import java.util.HashMap;
import java.util.Map;

public class LFUCache implements Cache {
    HashMap<Integer,Integer> cache = new HashMap<>();
    HashMap<Integer,Integer> freq=new HashMap<>();
    @Override
    public void insertKey(int key, int value) {
        freq.put(key,freq.getOrDefault(key,0)+1);
        cache.put(key,value);   
    }

    @Override
    public int getValue() {
        if (cache.isEmpty()) return -1;
        int res=0,mx=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            if(entry.getValue()<mx) {
                res=entry.getKey();
                mx=entry.getValue();
            }
        }
        return res;
    }

    @Override
    public void displayCache() {
        for (Map.Entry<Integer,Integer>entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



