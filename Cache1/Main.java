public class Main {
    public static void main(String[] args) {
        CacheFactory cacheFactory=new CacheFactory();
        LRUCache lruCache=(LRUCache) cacheFactory.getCacheFactory("lru");
        lruCache.insertKey(1, 10);
        lruCache.insertKey(2, 20);
        lruCache.insertKey(3, 30);
        System.out.println(lruCache.getValue());
        lruCache.displayCache();


        LFUCache lfuCache=(LFUCache) cacheFactory.getCacheFactory("lfu");
        lfuCache.insertKey(1, 10);
        lfuCache.insertKey(1, 15);

        lfuCache.insertKey(2, 20);
        
        lfuCache.insertKey(3, 30);
        lfuCache.insertKey(3, 35);
        System.out.println(lfuCache.getValue());
        lfuCache.displayCache();

    }
}
