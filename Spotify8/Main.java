import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        User userOne=new User(1,"Achyuth");
        Song song1=new Song(1,"A1");
        Song song2=new Song(2,"A2");
        Song song3=new Song(3,"A3");
        Song song4=new Song(4,"A4");
        Song song5=new Song(5,"A5");
        PlayList spotify=new PlayListServieImpl(new ConcurrentSkipListMap<>(),new AtomicLong(0L));
        spotify.addSong(song1);
        spotify.addSong(song2);
        spotify.addSong(song3);
        spotify.addSong(song4);
        spotify.addSong(song5);
        spotify.viewSongs();
        spotify.reorderSong(song5,1.0,2.0);
        System.out.println();
        spotify.viewSongs();
    }
}
