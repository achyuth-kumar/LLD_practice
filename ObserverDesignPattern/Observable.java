public interface Observable {
    public void addItem(Integer userId,Integer itemId);
    public void removeItem(Integer userId,Integer itemId);
    public void notifyMe();
}
