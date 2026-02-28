import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String [] args) {
        File file1=new File(1,"F1","text");
        File file2=new File(2,"F2","text");
        File file3=new File(3,"F3","text");
        Device oldDevice=new Device(1,"D1");
        Configuration configuration=new Configuration(new ConcurrentSkipListMap<>(),new AtomicLong());
        configuration.addFile(file1);
        configuration.addFile(file2);
        configuration.addFile(file3);
        oldDevice.setConfiguration(configuration);

        Device newDevice=new Device(2,"D2");
        SyncConfiguration syncConfiguration=new SyncConfigurationServiceImpl();
        syncConfiguration.sync(oldDevice,newDevice);
        newDevice.getConfiguration().viewFiles();
    }
}
