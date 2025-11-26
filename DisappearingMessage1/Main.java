public class Main {
    public static void main(String [] args) {

        User user=new User(1,"Achyuth",new Chat(1,"Kumar",new Message(1,new DisappearingMessage())));
        user.openChat();
        Chat chat=new Chat(1,"Kumar",new Message(1,new DisappearingMessage()));
        chat.sendMessage("Hello world");
        chat.sendMessage("Welcome to Bangalore");
        chat.sendMessage("Blue Yonder");
        chat.sendMessage("Coding in java");
        chat.displayMessages();
        chat.turnOnDisappearing();
        chat.sendMessage("Coding in c++");
        chat.sendMessage("Welcome to Mysore");
        chat.disappearMessage();
        chat.displayMessages();
    }

}
