import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class PlayListServiceImpl implements PlayList{
    ConcurrentSkipListMap<Double,Song> cache;
    AtomicLong positionGenerator;
    public PlayListServiceImpl() {
        this.cache = new ConcurrentSkipListMap<>();
        this.positionGenerator = new AtomicLong(0L);
    }
    @Override
    public void addSong(Song song) {
        Double currentPosition=Double.parseDouble(String.valueOf(positionGenerator.incrementAndGet()));
        cache.put(currentPosition,song);
    }

    @Override
    public void removeSong(Song song) {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            if(entry.getValue().getSongName().equals(song.getSongName())) {
                cache.remove(entry.getKey());
                break;
            }
        }
    }

    @Override
    public void reorderSong(Song song,Double prevPosition,Double nextPosition) {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            if(entry.getValue().getSongName().equals(song.getSongName())) {
                cache.remove(entry.getKey());
                break;
            }
        }
        Double newPosition=(prevPosition+nextPosition)/2;
        cache.put(newPosition,song);
    }

    @Override
    public void viewSongs() {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getSongName());
        }
    }
}
