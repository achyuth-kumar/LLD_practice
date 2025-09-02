import java.util.ArrayList;
import java.util.List;

public class Chat {
    List<String> Messages;
    Chat() {
        Messages=new ArrayList<>();
    }
    public void sendMessage(String message) {
        Messages.add(message);
    }
    public void deleteMessage() {
        Messages.removeAll(this.Messages);
    }
    public void pinMessage(String message) {
        int pos=-1;
        for(int i=0;i<Messages.size();i++) {
            if(Messages.get(i).equals(message)) {
                pos=i;
            }
        }
        if(pos<0) {
            System.out.println("select  valid message for pinning");
        }
        else if(pos<Messages.size()) {
            System.out.println("Pinned message : " + Messages.get(pos));
        }
    }
    public void displayAllMessages() {
        for(String message : Messages) {
            System.out.println(message);
        }
    }

}
