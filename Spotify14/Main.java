import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Song song1=new Song(1,"A");
        Song song2=new Song(2,"B");
        Song song3=new Song(3,"C");
        Song song4=new Song(4,"D");
        Song song5=new Song(5,"E");
        Playlist playlist=new PlaylistServiceImpl(new AtomicLong(0L),new ConcurrentSkipListMap<>());
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        System.out.println("Before reorder");
        playlist.viewSongs();

        playlist.reorderSong(song5,1.0,2.0);
        System.out.println("After reorder");
        playlist.viewSongs();
    }
}
