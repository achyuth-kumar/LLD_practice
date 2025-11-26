public class User {

    public Integer id;
    public String name;
    public Chat chat;
    public User(Integer id, String name, Chat chat) {
        this.id = id;
        this.name = name;
        this.chat = chat;
    }

    public void openChat() {
        chat.openChat();
    }
    public void closeChat() {
        chat.closeChat();
    }


}
