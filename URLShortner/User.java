public class User {
    public int id;
    public String name;
    Browser browser;
    User(int id,String name,Browser browser) {
        this.id=id;
        this.name=name;
        this.browser=browser;
    }
    public String getShortnedUrl(String url) {
        return browser.shortenUrl(url);
    }
    public String processRequest(String url) {
        return browser.processRequest(url);
    }
}
