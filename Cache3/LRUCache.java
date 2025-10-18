import java.util.Stack;

public class LRUCache implements Cache{
    Stack<Pair<Integer, Integer>> cache;
    LRUCache() {
        cache=new Stack<>();
    }
    @Override
    public void put(Integer key, Integer value) {
        Pair<Integer,Integer>p = new Pair<>();
        p.first=key;
        p.second=value;
        cache.push(p);
    }

    @Override
    public int get() {
        return cache.peek().second;
    }
}
