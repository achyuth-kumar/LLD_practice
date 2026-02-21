import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class playListServiceImpl implements playList{
    AtomicLong positionGenerator;
    ConcurrentHashMap<Double,String> order;
    public playListServiceImpl() {
        this.order = new ConcurrentHashMap<>();
        this.positionGenerator=new AtomicLong(0L);
    }
    @Override
    public void addSong(String songName) {
        Long nextPosition=positionGenerator.incrementAndGet();
        order.put(Double.parseDouble(String.valueOf(nextPosition)),songName);
    }

    @Override
    public void removeSong(String songName) {
        Double position=0.0D;
        for(Map.Entry<Double,String> entry : order.entrySet()) {
            if(entry.getValue().equals(songName)) {
                position=entry.getKey();
            }
        }
        order.remove(position);
    }

    @Override
    public void reorderSong(String songName, Double prevPosition, Double nextPosition) {
        Double newPosition=(prevPosition+nextPosition)/2;
        order.put(newPosition,songName);
    }

    @Override
    public void viewSongs() {
        List<Double> keys=new ArrayList<>(order.keySet());
        Collections.sort(keys);
        for(Double key : keys) {
            System.out.println(key+" , "+order.get(key));
        }
    }
}
