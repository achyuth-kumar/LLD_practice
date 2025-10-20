public class Main {
    public static void main(String[] args) {
        User user=new User(new Browser());
        user.ProcessRequest("WWW.WYNK.COM");

        user.ProcessRequest("WWW.SPOTIFY.COM");
        user.ProcessRequest("WWW.JIOSAAVN.COM");

        user.ProcessRequest("WWW.WYNK.COM");
        user.ProcessRequest("WWW.WYNK.COM");

        user.ProcessRequest("WWW.SPOTIFY.COM");

    }
}

