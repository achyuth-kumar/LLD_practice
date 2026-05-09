import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String [] args) {
        Song song1=new Song(1,"A");
        Song song2=new Song(2,"B");
        Song song3=new Song(3,"C");
        Song song4=new Song(4,"D");
        Song song5=new Song(5,"E");
        PlayList playList=new PlayListServiceImpl(new ConcurrentSkipListMap<>(),new AtomicLong(0L));
        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);
        playList.addSong(song4);
        playList.addSong(song5);
        System.out.println("Before reorder");
        playList.viewSongs();

        playList.reorderSong(song5,1.0,2.0);
        System.out.println("After reorder");
        playList.viewSongs();

    }
}
