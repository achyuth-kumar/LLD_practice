public class EndUser {
    Cache cache;
    EndUser(Cache cache) {
        this.cache=cache;
    }
    public void processRequest(String url) {
        cache.processRequest(url);
    }
    public void cacheEviction() {
        cache.cacheEviction();
    }
    public void display() {
        cache.DisplayCacheElements();
    }


}
