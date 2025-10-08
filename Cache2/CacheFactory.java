public class CacheFactory {
    public Cache getCache(String input) {
        if(input.equals("lru")) {
            return new LRUCache();
        }
        else if(input.equals("lfu")) {
            return new LFUCache();
        }
        return null;
    }
}
