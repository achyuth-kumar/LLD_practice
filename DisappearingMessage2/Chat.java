public class Chat {


    public int id;
    public String title;
    public boolean open;
    public Chat(int id, String title) {
        this.id = id;
        this.title = title;
        this.open=false;
    }
    public void openChat() {
        this.open=true;
    }
    public void closeChat() {
        this.open=false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOpen() {
        return open;
    }
}
