import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String [] args) {
        Song song1=new Song(1,"A");
        Song song2=new Song(2,"B");
        Song song3=new Song(3,"C");
        Song song4=new Song(4,"D");
        Song song5=new Song(5,"E");
        Playlist spotify=new PlaylistServiceImpl(new ConcurrentSkipListMap<>(),new AtomicLong());
        spotify.addSong(song1);
        spotify.addSong(song2);
        spotify.addSong(song3);
        spotify.addSong(song4);
        spotify.addSong(song5);
        System.out.println("Before reorder");
        spotify.viewSongs();

        spotify.reorderSong(song5,2.0,3.0);
        System.out.println("After reorder");
        spotify.viewSongs();

    }
}
