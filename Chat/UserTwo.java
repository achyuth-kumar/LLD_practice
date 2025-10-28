import java.util.ArrayList;
import java.util.List;

public class UserTwo implements  User{
    public Integer id;
    public String name;
    List<String> messages=new ArrayList<>();
    List<User> users=new ArrayList<>();
    public UserTwo(Integer id, String name,List<String> messages,List<User> users) {
        this.id = id;
        this.name = name;
        this.messages=messages;
        this.users=users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void SendMessage(String message,User TargetUser) {
        messages.add(message);
        TargetUser.RecieveMessage(message);
    }
    public void sendAll(String message) {
        /*for(User user :users) {
            user.RecieveMessage(message);
        }*/
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
        System.out.println("User Two chats : ");
        for(String message : messages) {
            System.out.print(message+" ");
        }
        System.out.println();
    }
}
