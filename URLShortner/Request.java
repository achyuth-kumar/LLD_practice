import java.util.HashMap;

public class Request {
    Response response;
    HashMap<String,String> browserCache=new HashMap<>();
    Request(Response response) {
        this.response=response;
    }
    public String processRequest(String url,HashMap<String,String> browserCache){
        return response.processResponse(url,browserCache);
    }
}
