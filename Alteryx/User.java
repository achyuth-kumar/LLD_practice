public class User extends NotificationServiceImpl {
    public String name;
    public UserType usertype;
    public User(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void update(String user) {
        super.update(user);
    }
}
