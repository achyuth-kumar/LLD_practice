import java.util.HashMap;

public class Response {
    HashMap<String,String> browserCache=new HashMap<>();
    Response(HashMap<String,String> browserCache) {
        this.browserCache=browserCache;
    }
    public String processResponse(String request, HashMap<String,String> browserCache) {
        browserCache.put(request,"Response_data_for : "+request);
        return browserCache.get(request);
    }
}
