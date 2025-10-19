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
        cache.SetValue(0,10);
        cache.SetValue(0,20);


        cache.SetValue(1,100);
        cache.SetValue(1,200);
        cache.SetValue(1,300);
        cache.SetValue(1,400);
//0 -> 10
//1 -> 10 20
        cache.GetValue(0,1);

    }
}
