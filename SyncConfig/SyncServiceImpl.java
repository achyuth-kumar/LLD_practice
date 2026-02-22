public class SyncServiceImpl implements SyncService{
    @Override
    public void sync(Device oldDevice, Device newDevice) {
        Configuration oldConfiguration=oldDevice.getConfiguration();
        newDevice.setConfiguration(oldConfiguration);
    }
}
