public class NotificationServiceImpl implements Observer{

    public String name;

    public NotificationServiceImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String user) {
        System.out.println(user+" have been updated");
    }
}
