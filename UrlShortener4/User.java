public class User {
    public int id;
    public String name;
    public Browser browser;
    public User(int id, String name,Browser browser) {
        this.id = id;
        this.name = name;
        this.browser=browser;
    }
    public void processRequest(String url) {
        browser.processRequest(url);
    }

    public String getShortenedUrl(String url) {
        return browser.getShortenedUrl(url);
    }
    public String getOriginalUrl(String shortenedUrl) {
        return browser.getOriginalUrl(shortenedUrl);
    }

}
