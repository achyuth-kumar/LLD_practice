public class User {
    public int id;
    public String name;
    public Chat openChat() {
        return new Chat();
    }
    public Chat closeChat() {
        return null;
    }
}
