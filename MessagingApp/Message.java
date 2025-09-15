import java.util.*;

public class Message {
    public static HashMap<Integer,Queue<String>> messageQueue=new HashMap<>();

    public static  void sendMessage(Integer id,String message) {
        if(messageQueue.containsKey(id)) {
            Queue<String> messages=messageQueue.get(id);
            messages.add(message);
            messageQueue.put(id, messages);
            System.out.println("message sent from : " + id + " : " + message);
        }
        else {
            messageQueue.put(id,new LinkedList<>(List.of(new String[]{message})));
            System.out.println("message sent from : " + id + " : " + message);
        }
    }
    public static void recieveMessage(Integer id) {
        if(messageQueue.containsKey(id)) {
            Queue<String> messages = messageQueue.get(id);
            System.out.println("Recieved messages : ");
            Iterator it=messages.stream().iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }
        else {
            System.out.println("Invalid reveiver ID");
        }
    }
    public static void displayAllMessage() {
        System.out.println("Display all messages : ");
       for(Map.Entry<Integer,Queue<String>> entry : messageQueue.entrySet()) {
           System.out.println("ID : "+entry.getKey());
           Queue<String> q= entry.getValue();
           Iterator it=q.stream().iterator();
           while(it.hasNext()) {
               System.out.println(it.next());
           }
       }
    }
}
