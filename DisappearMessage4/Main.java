import java.time.LocalDateTime;

public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Chat chat=new Chat(1,"Demo chat");
        Messages messages=new Messages(1);
        DisappearMessage disappearMessage=new DisappearMessage(messages);
        messages.sendMessage("Hi");
        messages.sendMessage("Hello");
        messages.sendMessage("Welcome to java");
        messages.sendMessage("Lenovo");
        messages.sendMessage("Dell");
        messages.sendMessage("Asus");
        messages.sendMessage("Redmi");
        messages.sendMessage("Bangalore");
        messages.sendMessage("Mysore");


        messages.deleteMessage("Lenovo");
        messages.pinMessage("Welcome to java");
        System.out.println("Before Disappear : ");
        messages.viewMessages();
        System.out.println();

        disappearMessage.turnOn(LocalDateTime.now());
        disappearMessage.turnOff(LocalDateTime.now().plusHours(3));
        System.out.println("Disappearing Window  : "+LocalDateTime.now().getHour()+" , "+LocalDateTime.now().plusHours(3).getHour());
        disappearMessage.isExpiry();
        System.out.println("After Disappear : ");
        messages.viewMessages();
        System.out.println();

    }
}
