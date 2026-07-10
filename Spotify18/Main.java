import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Song song1=new Song("A",1);
        Song song2=new Song("B",2);
        Song song3=new Song("C",3);
        Song song4=new Song("D",4);
        Song song5=new Song("E",5);
        PlayList playList=new PlayListServiceImpl(new ConcurrentSkipListMap<>(),new AtomicLong(0L));
        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);
        playList.addSong(song4);
        playList.addSong(song5);
        System.out.println("Before reorder");
        playList.viewSongs();

        System.out.println("After reorder");
        playList.reorderSong(song5,1.0,2.0);
        playList.viewSongs();
    }
}
