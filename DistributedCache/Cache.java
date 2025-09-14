import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Cache {
    public HashMap<String,Integer> cache=new HashMap<>();
    public static int MAX_SIZE=5;
    Stack<String> urls=new Stack<>();
    public void processRequest(String url) {
        calculateFrequency(url);
        cacheEviction();
    }
    public void calculateFrequency(String url) {
        urls.push(url);
        cache.put(url,cache.getOrDefault(url,0)+1);
    }
    public void cacheEviction() {
        int minValue=Integer.MAX_VALUE;
        String LRUKey="";
        if(cache.size()>MAX_SIZE) {
            /*for (Map.Entry<String, Integer> entry : cache.entrySet()) {
                if (entry.getValue() < minValue) {
                    LRUKey = entry.getKey();
                    minValue = entry.getValue();
                }
            }*/
            LRUKey=urls.peek();
            urls.pop();
            cache.remove(LRUKey);
            System.out.println(LRUKey+" : got evicted");
        }
    }
    public void DisplayCacheElements() {
        System.out.println("Cache elements : ");
        for(Map.Entry<String,Integer> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
