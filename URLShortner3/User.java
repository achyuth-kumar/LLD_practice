public class User {
    public int id;
    public String name;

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
    Browser browser;
    public User(Browser browser) {
        this.browser=browser;
    }
    public void ProcessRequest(String URL) {
        browser.ProcessRequest(URL);
    }

}
