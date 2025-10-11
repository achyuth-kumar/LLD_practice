import java.util.List;

public interface Observable {
    public void addItem(Integer id,String productName);
    public void removeItem(Integer id);
    public void notification(List<NotificationServiceImpl> notificationServiceList);
    public void displayCartItems(); 
}
