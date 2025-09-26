public class User {
    public int id;
    public String name;
    Chat chat;
    User(int id,String name,Chat chat) {
        this.id=id;
        this.name=name;
        this.chat=chat;
    }
    public void openChat() {
        chat.OpenChat();
    }
    public void closeChat() {
        chat.CloseChat();
    }
}
