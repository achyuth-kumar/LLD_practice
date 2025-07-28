public class Main {
    public static void main(String [] args) {
        URL url=new URL("http://",":jiosaavn",8080,"/music","/playist");
        System.out.println(url.protocol+url.port+url.domain+url.pathParam+url.queryParam);        
    }
}