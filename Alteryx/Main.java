import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        HashMap<NotificationServiceImpl, Boolean> users=new HashMap<>();
        User userOne =new User("Achyuth");
        users.put(userOne,true);
        User userTwo=new User("Kumar");
        users.put(userTwo,false);
        User userThree=new User("Rohan");
        users.put(userThree,true);

        Observable observable=new ObservableImpl(users);
        observable.AddItem();
        observable.RemoveItem();
        observable.NotifyMe();

    }
}
