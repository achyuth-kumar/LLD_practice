public class User {
    Request request;
    User(Request request) {
        this.request=request;
    }
    public void hitUrl(String url) {
        request.invokeBrowser(url);
    }
}
