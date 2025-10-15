public class MyUser {
    public int Id;
    public String Name;
    Browser browser;
    MyUser(Browser browser) {
        this.browser=browser;
    }
    MyUser(int id, String name, Browser browser) {
        Id = id;
        Name = name;
        this.browser = browser;
    }
    public void sendRequest(String url) {
        browser.ProcessRequest(url);
    }

}
