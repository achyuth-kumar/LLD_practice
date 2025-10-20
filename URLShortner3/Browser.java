import javax.lang.model.util.Elements;
import java.util.HashMap;
import java.util.Random;

public class Browser {
    public Integer SHORTENED_CODE_LENGTH=4;
    HashMap<String,String> RequestCache=new HashMap<>();
    HashMap<String,String> ResponseCache=new HashMap<>();
    public void ProcessRequest(String OriginalURL) {
        if(RequestCache.containsKey(OriginalURL)) {
            System.out.println("Request : "+ OriginalURL+",: Response : "+ResponseCache.get(RequestCache.get(OriginalURL)));
            return ;
        }
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        for(int i=0;i<SHORTENED_CODE_LENGTH;i++) {
            s.append(random.nextInt(SHORTENED_CODE_LENGTH));
        }
        RequestCache.put(OriginalURL,s.toString());
        ProcessResponse(s.toString());
        System.out.println("Request : "+OriginalURL+",: Response : "+ResponseCache.get(s.toString()));
    }
    public void ProcessResponse(String ShortenedURL) {
        ResponseCache.put(ShortenedURL,"RESPONSE Ready for "+ShortenedURL);
        return ;
    }
}

