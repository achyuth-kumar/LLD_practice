import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LFUCache implements Cache {
    HashMap<Integer,List<Integer>> cache=new HashMap<>();
    @Override
    public void insertKey(Integer key, Integer value) {
        int count=0;
        if(cache.containsKey(key)) {
            List<Integer> list=cache.get(key);
            count=list.get(0);
            count+=1;
            list.set(0,count);
            list.set(1,value);
            cache.put(key,list);
        }
        else {
            List<Integer> list=new ArrayList<>();
            list.add(0);
            list.add(value);
            cache.put(key,list);
        }
    }

    @Override
    public int getValue() {
        int vl=0,mx=Integer.MAX_VALUE;
        for(List<Integer> e : cache.values()) {
            if(e.get(0)<mx) {
                vl=e.get(1);
                mx=e.get(0);
            }
        }
        return vl;
    }

    @Override
    public void displayItems() {
        for(Map.Entry<Integer,List<Integer>> e : cache.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue().get(1));
        }
    }

}