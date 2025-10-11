import java.util.Stack;

public class LRUCache implements Cache {
    Stack<Pair<Integer, Integer>> cache = new Stack<>();

    @Override
    public void insertKey(int key, int value) {
        cache.push(new Pair<>(key, value));   
    }

    @Override
    public int getValue() {
        if (cache.isEmpty()) return -1;

        Pair<Integer, Integer> p = cache.peek();
        return p.value;
    }

    @Override
    public void displayCache() {
        for (Pair<Integer, Integer> p : cache) {
            System.out.println(p.key + " -> " + p.value);
        }
    }
}

