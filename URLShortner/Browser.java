import java.util.HashMap;
import java.util.Random;

public class Browser {
    HashMap<String,String> Shortner=new HashMap<>();
    HashMap<String,String> browserCache=new HashMap<>();
    Request request;
    Browser(Request request) {
        this.request=request;
    }
    public String shortenUrl(String url) {
        Random random=new Random();
        StringBuilder s= new StringBuilder();
        int n=url.length();
        for(int i=0;i<4;i++) {
            s.append(random.nextInt(n));
        }
        Shortner.put(url, s.toString());
        return Shortner.get(url);
    }
    public String processRequest(String url) {
        System.out.println("Processing request : "+ url);
        if(browserCache.containsKey(url)) {
            return  browserCache.get(url);
        }
        return request.processRequest(url,browserCache);
    }
}

