import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class ConfigurationServiceImpl implements Configuration{

    ConcurrentSkipListMap<Double,File> cache;
    AtomicLong positionGenerator;
    public ConfigurationServiceImpl() {
        this.cache = new ConcurrentSkipListMap<>();
        this.positionGenerator = new AtomicLong(0L);
    }
    @Override
    public void addFiles(File file) {
        Double currentPosition=Double.parseDouble(String.valueOf(positionGenerator.incrementAndGet()));
        cache.put(currentPosition,file);
    }

    @Override
    public void removeFiles(File file) {
        Double deletedIndex=0.0;
        for(Map.Entry<Double,File> entry : cache.entrySet()) {
            if(entry.getValue().getFileName().equals(file.getFileName())) {
                deletedIndex=entry.getKey();
            }
        }
        cache.remove(deletedIndex);
    }

    @Override
    public void viewData() {
        for(Map.Entry<Double,File> entry : cache.entrySet()) {
            System.out.println(entry.getKey()+" , "+entry.getValue().getFileName());
        }
    }
}
