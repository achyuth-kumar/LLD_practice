public class Main {
    public static void main(String [] args) {
        CacheFactory cacheFactory=new CacheFactory();
        Cache lruCache=cacheFactory.getCache("lru");
        System.out.println("LRU cache");
        lruCache.insertKey(1, 10);
        lruCache.insertKey(2, 20);
        lruCache.insertKey(3, 30);
        lruCache.insertKey(4, 40);
        System.out.println(lruCache.getValue());
        lruCache.displayItems();
        
        Cache lfuCache=cacheFactory.getCache("lfu");
        lfuCache.insertKey(1, 10);
        lfuCache.insertKey(1, 15);
        
        lfuCache.insertKey(2, 20);
        
        lfuCache.insertKey(3, 30);
        lfuCache.insertKey(3, 35);
        System.out.println(lfuCache.getValue());
        lfuCache.displayItems();
    }
}
