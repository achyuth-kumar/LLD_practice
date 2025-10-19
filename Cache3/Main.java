public class Main {
    public static  void main(String [] args) {
//        Cache LRUCache=new LRUCache();
//        LRUCache.put(1,11);
//        LRUCache.put(1,12);
//
//        LRUCache.put(2,21);
//        LRUCache.put(2,22);
//        LRUCache.put(2,23);
//
//        LRUCache.put(3,31);
//        LRUCache.put(3,32);
//        System.out.println("LRU Cache get : "+LRUCache.get());
//
//        Cache LFUCache=new LFUCache();
//        LFUCache.put(1,11);
//        LFUCache.put(1,12);
//        LFUCache.put(1,13);
//
//        LFUCache.put(2,21);
//
//
//        LFUCache.put(3,31);
//        LFUCache.put(3,32);
//        LFUCache.put(3,33);
//
//        System.out.println("LFU cache get : "+LFUCache.get());
        SnapCache cache=new SnapCache();
        cache.put(1,0,10);
        cache.put(1,1,20);
//        cache.put(1,2,30);
//        cache.put(1,3,40);

        cache.get(1,1);

    }
}
