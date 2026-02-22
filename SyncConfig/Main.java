public class Main {
    public static void main(String [] args) {
        Configuration configuration=new ConfigurationServiceImpl();
        File file1=new File(1,"F1");
        File file2=new File(2,"F2");
        File file3=new File(3,"F3");
        File file4=new File(4,"F4");
        configuration.addFiles(file1);
        configuration.addFiles(file2);
        configuration.addFiles(file3);
        configuration.addFiles(file4);
        Device oldDevice=new Device(1,"D1","MI",configuration);
        Device newDevice=new Device(2,"D2","MI",new ConfigurationServiceImpl());
        SyncService syncService=new SyncServiceImpl();
        System.out.println("Old Device : ");
        oldDevice.getConfiguration().viewData();
        syncService.sync(oldDevice,newDevice);
        System.out.println("New Device : ");
        newDevice.getConfiguration().viewData();
    }
}
