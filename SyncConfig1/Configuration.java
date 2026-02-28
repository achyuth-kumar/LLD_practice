import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Configuration {

    AtomicLong positionGenerator;

    ConcurrentSkipListMap<Double,File> cache;
    public Configuration(ConcurrentSkipListMap<Double, File> cache,AtomicLong positionGenerator) {
        this.cache = cache;
        this.positionGenerator=positionGenerator;
    }
    public void addFile(File file) {
        Double newPosition=Double.parseDouble(String.valueOf(positionGenerator.incrementAndGet()));
        cache.put(newPosition,file);
    }
    public void removeFile(File file) {
        for(Map.Entry<Double,File> entry : cache.entrySet()) {
            if(file.getName().equals(entry.getValue().getName())) {
                cache.remove(entry.getKey());
                break;
            }
        }
    }
    public void viewFiles() {
        for(Map.Entry<Double,File> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getName());
        }
    }

}
