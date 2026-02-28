public class SyncConfigurationServiceImpl implements SyncConfiguration{
    @Override
    public void sync(Device oldDevice, Device newDevice) {
        Configuration existingConfiguration=oldDevice.getConfiguration();
        newDevice.setConfiguration(existingConfiguration);
    }
}
