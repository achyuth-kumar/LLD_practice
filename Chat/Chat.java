import java.util.ArrayList;
import java.util.List;

public class Chat {
    public Integer id;
    public String title;
    List<String> messages=new ArrayList<>();
    List<User> users=new ArrayList<>();
    Chat(List<User> users) {
        this.users=users;
    }
    public void SendMessage(String message,User TargetUser) {
        messages.add(message);
        TargetUser.RecieveMessage(message);
    }
    public void sendAll(String message) {
        for(User user :users) {
            user.RecieveMessage(message);
        }
    }
    public void RecieveMessage(String message) {
        messages.add(message);
    }
    public void DeleteMessage(String message) {
        messages.remove(message);
    }
    public void PinMessage(String message) {
        System.out.println("Pinned message : "+message);
    }
    public void DisplayMessages() {
        System.out.println("Admin user chats : ");
        for(String message : messages) {
            System.out.print(message+" ");
        }
        System.out.println();
    }
}
