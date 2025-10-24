public class User {
    public Integer id;
    public String name;
    public Browser browser;

    public User(Integer id, String name, Browser browser) {
        this.id = id;
        this.name = name;
        this.browser = browser;
    }

    public void search(String URl) {
        browser.ProcessRequest(URl);
    }

}
