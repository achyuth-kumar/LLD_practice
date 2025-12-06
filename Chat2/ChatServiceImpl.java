import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatServiceImpl implements Chat{

    HashMap<Integer, List<String>> messages;
    HashMap<Integer,List<User>> Participants;
    Integer chatId;
    public ChatServiceImpl(Integer chatId) {
        this.chatId=chatId;
        this.messages = new HashMap<>();
        messages.put(chatId,new ArrayList<>());
        this.Participants=new HashMap<>();
        Participants.put(chatId, new ArrayList<>());
    }

    @Override
    public void sendMessage(User sender,String message) {
        messages.get(this.chatId).add(message);
        Participants.get(this.chatId).add(sender);
    }

    @Override
    public void deleteMessage(String message) {
        List<String> ListOfMessages=messages.get(this.chatId);
        ListOfMessages.remove(message);
        messages.put(this.chatId,ListOfMessages);
    }

    @Override
    public void pinMessage(String message) {
        System.out.println("Pinned message : "+message);
    }

    @Override
    public void viewMessage() {
        System.out.println(messages.get(this.chatId));
    }
}
