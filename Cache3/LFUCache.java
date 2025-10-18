import java.util.*;

public class LFUCache implements Cache{
    HashMap<Integer, List<Integer>> cache;
    LFUCache() {
        cache=new HashMap<>();
    }
    @Override
    public void put(Integer key, Integer value) {
        if(cache.containsKey(key)) {
            Integer previous_frequency=cache.get(key).get(0);
            previous_frequency+=1;
            List<Integer> list=new ArrayList<>();
            list.add(previous_frequency);
            list.add(value);
            cache.put(key,list);
        }
        else  {
            List<Integer> list=new ArrayList<>();
            list.add(0);
            list.add(value);
            cache.put(key,list);
        }
    }

    @Override
    public int get() {
        int mn=Integer.MAX_VALUE,result=0;
        for(Map.Entry<Integer,List<Integer>> entry : cache.entrySet()) {
            if(entry.getValue().get(0)<mn) {
                result=entry.getValue().get(1);
                mn=entry.getValue().get(0);
            }
        }
        return result;
    }
}
