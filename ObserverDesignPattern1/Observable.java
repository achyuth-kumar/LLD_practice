public interface Observable {
    public void addItem(String itemName);
    public void removeItem(String itemName);
    public void notifyMe();
    public void viewItems();
    public void reorderItems(String itemName,Double beforePosition,Double nextPosition);
}

