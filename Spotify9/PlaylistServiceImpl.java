import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class PlaylistServiceImpl implements Playlist{



    ConcurrentSkipListMap<Double,Song> cache;
    AtomicLong positionGenerator;
    public PlaylistServiceImpl(ConcurrentSkipListMap<Double, Song> cache, AtomicLong positionGenerator) {
        this.cache = cache;
        this.positionGenerator = positionGenerator;
    }
    @Override
    public void addSong(Song song) {
        Double currentPosition=Double.parseDouble(String.valueOf(positionGenerator.incrementAndGet()));
        cache.put(currentPosition,song);
    }

    @Override
    public void removeSong(Song song) {
        for(Map.Entry<Double,Song> e : cache.entrySet()) {
            if(e.getValue().getName().equals(song.getName())) {
                cache.remove(e.getKey());
                break;
            }
        }
    }

    @Override
    public void reorderSong(Song song, Double prevPosition, Double nextPosition) {
        removeSong(song);
        Double newPosition=(prevPosition+nextPosition)/2;
        cache.put(newPosition,song);
    }

    @Override
    public void viewSongs() {
        for(Map.Entry<Double,Song> e : cache.entrySet()) {
            System.out.println(e.getKey()+" , "+e.getValue().getName());
        }
    }
}
