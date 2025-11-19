public class User {

    public int id;
    public String name;
    public Browser browser;
    public User(int id, String name,Browser browser) {
        this.id = id;
        this.name = name;
        this.browser=browser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void processRequest(String url) {
        browser.processRequest(url);
    }
    public String getShortenedUrl(String url) {
        return browser.getShortenedURL(url);
    }
    public String getOriginalURl(String shortenedURl) {
        return  browser.getOriginalURL(shortenedURl);
    }



}
