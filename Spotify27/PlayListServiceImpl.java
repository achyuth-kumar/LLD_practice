import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class PlayListServiceImpl implements PlayList{
    ConcurrentSkipListMap<Double,Song> cache;
    AtomicLong positionGenerator;
    public PlayListServiceImpl(ConcurrentSkipListMap<Double, Song> cache, AtomicLong positionGenerator) {
        this.cache = cache;
        this.positionGenerator = positionGenerator;
    }
    @Override
    public void addSong(Song song) {
        Double newPosition= (double) positionGenerator.incrementAndGet();
        cache.put(newPosition,song);
    }

    @Override
    public void removeSong(Song song) {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            if(entry.getValue().getTitle().equals(song.getTitle())) {
                cache.remove(entry.getKey());
            }
        }
    }

    @Override
    public void reorderSong(Song song, Double prevPosition, Double nextPosistion) {
        removeSong(song);
        Double newPosition=(prevPosition+nextPosistion)/2;
        cache.put(newPosition,song);
    }

    @Override
    public void viewSongs() {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getTitle());
        }
    }
}
