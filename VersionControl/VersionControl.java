public interface VersionControl {
    public void put(Integer key,Integer Value);
    public void getValueAtVersion(Integer key,Integer version);
}
