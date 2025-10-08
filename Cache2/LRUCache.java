import java.util.Stack;
public class LRUCache implements Cache {
    Stack<Pair<Integer,Integer>> cache=new Stack<Pair<Integer,Integer>>();
    @Override
    public void insertKey(Integer key, Integer value) {
        Pair<Integer,Integer> p=new Pair<>();
        p.first=key;
        p.second=value;
        cache.push(p);
    }

    @Override
    public int getValue() {
        Pair<Integer,Integer> p=cache.peek();
        return p.second;
    }

    @Override
    public void displayItems() {
        for(Pair<Integer, Integer> i : cache) {
            System.out.println(i.first+" : "+i.second);
        }
    }
    
}
