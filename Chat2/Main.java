public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Chat chat=new ChatServiceImpl(1);
        chat.sendMessage(user,"Hello World");
        chat.sendMessage(user,"Welcome to Gangavathi");
        chat.sendMessage(user,"Welcome to Bangalore");
        chat.viewMessage();
        chat.deleteMessage("Welcome to Bangalore");
        chat.viewMessage();

    }
}
