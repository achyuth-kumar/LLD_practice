public class Main {
    public static void main(String [] args) {
        EndUser user=new EndUser(new Cache());
        user.processRequest("Wynk.com");
        user.processRequest("Wynk.com");
        user.processRequest("Wynk.com");
        user.processRequest("Wynk.com");
        user.processRequest("Wynk.com");
        user.processRequest("Spotify.com");
        user.processRequest("JioSaavn.com");
        user.processRequest("Groove.com");
        user.processRequest("IdeaMusic.com");
        user.processRequest("AppleStore.com");
        user.processRequest("VodaphoneMusic.com");
        user.processRequest("MiStoreMusic.com");
        user.display();
        user.cacheEviction();
    }

}
