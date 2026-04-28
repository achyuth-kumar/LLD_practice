import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String [] args) {
        Song song1=new Song(1,"A");
        Song song2=new Song(2,"B");
        Song song3=new Song(3,"C");
        Song song4=new Song(4,"D");
        Song song5=new Song(5,"E");

        playlist spotify=new playlistServiceImpl(new AtomicLong(0L),new ConcurrentSkipListMap<>());
        spotify.addSong(song1);
        spotify.addSong(song2);
        spotify.addSong(song3);
        spotify.addSong(song4);
        spotify.addSong(song5);
        System.out.println("Before reorder");
        spotify.viewSongs();

        spotify.reorderSong(song5,1.0,2.0);
        System.out.println("Before reorder");
        spotify.viewSongs();
    }
}
