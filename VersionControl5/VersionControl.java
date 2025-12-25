public interface VersionControl {
    public void put(Integer key,String value);
    public void get(Integer key,Integer version);
    public void view();
}
