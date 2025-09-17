import java.util.HashMap;
import java.util.Random;

public class Browser {
    public HashMap<String,String> requestCache=new HashMap<>();
    Response response;
    Browser(Response response) {
        this.response=response;
    }
    public void processRequest(String url) {
        if(requestCache.containsKey(url)) {
            System.out.println("Request:"+url+",response:"+response.processResponse(requestCache.get(url)));
            return ;
        }
        int n=4;
        Random random=new Random();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++) {
            s.append(random.nextInt(n));
        }
        requestCache.put(url,s.toString());
        System.out.println("Request:"+url+",shortened url:"+requestCache.get(url)+",response:"+response.processResponse(url));
    }
}
