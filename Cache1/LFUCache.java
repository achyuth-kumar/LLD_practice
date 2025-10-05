import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LFUCache implements Cache {
    HashMap<Integer,List<Integer>> cache = new HashMap<>();
    @Override
    public void insertKey(int key, int value) {
        List<Integer> list=new ArrayList<>();
        if(cache.containsKey(key)) {
            list=cache.get(key);
            list.set(0,list.get(0)+1);
            list.set(1,value);
        }
        else {
            list.add(0);
            list.add(value);
        }
        cache.put(key,list);   
    }

    @Override
    public int getValue() {
        if (cache.isEmpty()) return -1;
        int res=0,mx=Integer.MAX_VALUE;
        for(List<Integer> entry : cache.values()) {
            if(entry.get(0)<mx) {
                res=entry.get(1);
                mx=entry.get(0);
            }
        }
        return res;
    }

    @Override
    public void displayCache() {
        for (Map.Entry<Integer,List<Integer>>entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().get(1));
        }
    }
}



