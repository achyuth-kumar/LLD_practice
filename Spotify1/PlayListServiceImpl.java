import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class PlayListServiceImpl implements PlayList{
    AtomicLong positionGenerator;
    ConcurrentSkipListMap<Double,Song> cache;
    public PlayListServiceImpl() {
        this.cache = new ConcurrentSkipListMap<>();
        this.positionGenerator=new AtomicLong(0L);
    }
    @Override
    public void addSong(Song song) {
        Double currentPosition=Double.parseDouble(String.valueOf(positionGenerator.incrementAndGet()));
        cache.put(currentPosition,song);
    }

    @Override
    public void removeSong(Song song) {
        Double deletedIndex=0.0;
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            if(entry.getValue().equals(song.getName())) {
                deletedIndex=entry.getKey();
                break;
            }
        }
        cache.remove(deletedIndex);
    }

    @Override
    public void reorderSong(Song song, Double prevPosition, Double nextPosition) {
        Double newPosition=((prevPosition+nextPosition)/2);
        cache.put(newPosition,song);
    }

    @Override
    public void viewSongs() {
        for(Map.Entry<Double,Song> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getName());
        }
    }
}
