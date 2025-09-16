public interface Cache {
    public void write(int key,String value);
    public String read(int key);
    public void evict(Integer key,String value);
    public void display();
}
