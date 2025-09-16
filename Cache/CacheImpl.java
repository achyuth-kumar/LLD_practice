import java.util.HashMap;
import java.util.Map;

public class CacheImpl implements Cache{
    public int MAX_SIZE=5;
    HashMap<Integer,String> cache=new HashMap<>();
    HashMap<Integer,Integer> frequency=new HashMap<>();
    @Override
    public void write(int key,String value) {
        if(!cache.containsKey(key)) {
            cache.put(key,value);
            frequency.put(key,frequency.getOrDefault(key,0)+1);
        }
        else {
            for(Map.Entry<Integer,String> entry : cache.entrySet()) {
                if(entry.getKey()==key) {
                    entry.setValue(value);
                    frequency.put(key,frequency.getOrDefault(key,0)+1);
                    break;
                }
            }
        }
        if(cache.size()>MAX_SIZE){
            this.evict(key,value);
        }
    }

    @Override
    public String read(int key) {
        if(!cache.containsKey(key)) {
            System.out.println(key+" : key not found");
        }
        return cache.get(key);
    }

    @Override
    public void evict(Integer key,String value) {
        int min_frequency = Integer.MAX_VALUE,key_element=-1;
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()) {
            if(entry.getValue()<=min_frequency && entry.getKey()!=key && !entry.getValue().equals(value)) {
                min_frequency=entry.getValue();
                key_element=entry.getKey();
            }
        }
        System.out.println(key_element+" : "+cache.get(key_element)+" - key element got evicted");
        cache.remove(key_element);
        frequency.remove(key_element);
    }
    @Override
    public void display() {
        for(Map.Entry<Integer,String> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
