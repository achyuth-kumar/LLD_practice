public class Main {
    public static void main(String[] args) {
        Song song=new Song(1,"Unstoppable");
        User user=new User(1,"Achyuth");
        playList spotify=new playListServiceImpl();
        spotify.addSong("A1");
        spotify.addSong("A2");
        spotify.addSong("A3");
        spotify.addSong("A4");
        spotify.reorderSong("B1",1.0,2.0);
        spotify.viewSongs();
    }
}
