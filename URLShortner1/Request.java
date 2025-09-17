public class Request {
    Browser browser;
    Request(Browser browser) {
        this.browser=browser;
    }
    public void invokeBrowser(String url) {
        browser.processRequest(url);
    }
}
