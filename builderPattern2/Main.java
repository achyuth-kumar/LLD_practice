public class Main {
    public static void main(String [] args) {
        URL url=new URL("http://",8080,"/spotify","/music","/playlist");
        System.out.println(url.protocol+url.port+url.domain+url.pathParam+url.queryParam);
    }
}