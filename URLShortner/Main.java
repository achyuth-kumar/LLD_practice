import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Browser browser=new Browser(new Request(new Response(new HashMap<>())));
        User user=new User(1,"Achyuth",browser);
        String shortnedUrl= user.getShortnedUrl("wwwdotwynkmusicdotcom");
        System.out.println("Shortned url : "+shortnedUrl);

        String response=user.processRequest(shortnedUrl);
        System.out.println("My Response : "+response);

        response=user.processRequest(shortnedUrl+"1");
        System.out.println("My Response : "+response);

        response=user.processRequest(shortnedUrl+"2");
        System.out.println("My Response : "+response);

        response=user.processRequest(shortnedUrl);
        System.out.println("My Response : "+response);
    }
}
