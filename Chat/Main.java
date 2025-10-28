import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        AdminUser admin=new AdminUser(1,"Achyuth");
        User userTwo=new UserTwo(2,"Kumar",new ArrayList<>(),new ArrayList<>());
        User userThree=new UserThree(3,"Ravi",new ArrayList<>(),new ArrayList<>());
        List<User> users=new ArrayList<>();
        users.add(userTwo);
        users.add(userThree);
        Chat chat=new Chat(users);
        chat.SendMessage("Hello World",userThree);
        userThree.DisplayMessages();
    }
}
