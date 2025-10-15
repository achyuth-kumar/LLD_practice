import java.util.HashMap;
import java.util.Random;

public class Browser {
    HashMap<String,String> RequestCache=new HashMap<>();
    HashMap<String,String> ResponseCache=new HashMap<>();
    public void ProcessRequest(String url) {
        if(RequestCache.containsKey(url)) {
            System.out.println(ResponseCache.get(RequestCache.get(url)));
            return ;
        }
        int n=4;
        Random random=new Random();
        StringBuffer s=new StringBuffer();
        for(int i=0;i<4;i++) {
            s.append(random.nextInt(n));
        }
        RequestCache.put(url,s.toString());
        System.out.println("Shortened url from : "+url+ " to "+RequestCache.get(url));
        ProcessResponse(s.toString());
    }
    public void ProcessResponse(String shortenedUrl) {
        ResponseCache.put(shortenedUrl,"Response for shortened url : "+shortenedUrl);
        System.out.println(ResponseCache.get(shortenedUrl));
    }
}
