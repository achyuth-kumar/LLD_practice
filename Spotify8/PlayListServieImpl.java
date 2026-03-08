import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class PlayListServieImpl implements PlayList{

    ConcurrentSkipListMap<Double,Song> cache;
    AtomicLong positionGenerator;
    public PlayListServieImpl(ConcurrentSkipListMap<Double, Song> cache, AtomicLong positionGenerator) {
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
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            if(entry.getValue().getName().equals(song.getName())) {
                cache.remove(entry.getKey());
                break;
            }
        }
    }

    @Override
    public void reorderSong(Song song, Double prevPosition, Double nextPosition) {
        Double newPosition=(prevPosition+nextPosition)/2;
        this.removeSong(song);
        cache.put(newPosition,song);
    }

    @Override
    public void viewSongs() {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getName());
        }
    }
}
