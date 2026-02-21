public class Main {
    public static void main(String[] args) {
        Song song1=new Song(1,"A1");
        Song song2=new Song(2,"A2");
        Song song3=new Song(3,"A3");
        Song song4=new Song(4,"A4");
        Song song5=new Song(5,"A5");
        User user=new User(1,"Achyuth");
        PlayList spotify=new PlayListServiceImpl();
        spotify.addSong(song1);
        spotify.addSong(song2);
        spotify.addSong(song3);
        spotify.addSong(song4);
        spotify.addSong(song5);
        spotify.viewSongs();
        System.out.println();
        Song newSong=new Song(6,"B1");
        spotify.reorderSong(newSong,0.0,1.0);
        spotify.viewSongs();
    }
}
