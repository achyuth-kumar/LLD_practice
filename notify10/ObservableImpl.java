public class ObservableImpl implements Observable{
    
    @Override
    public void add() {
        System.out.println("Item added to cart");
    }
    @Override
    public void remove() {
        System.out.println("Item removed from cart");
    }

    @Override
    public void notifyMe() {
        NotificationServiceImpl emailEmailNotificationServiceImpl=new EmailNotificationServiceImpl();
        emailEmailNotificationServiceImpl.update("email");
        NotificationServiceImpl messageNotificationServiceImpl=new MessageNotificationServiceImpl();
        messageNotificationServiceImpl.update("message");
    }
}
