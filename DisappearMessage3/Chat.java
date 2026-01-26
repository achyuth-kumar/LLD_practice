public class Chat {
    public Integer chatId;
    public boolean opened;
    public void openChat(){
        this.opened=true;
        System.out.println("Chat opened");
    }
    public void closeChat() {
        this.opened=false;
        System.out.println("Chat closed");
    }
    public boolean isOpened() {
        return this.opened;
    }

}
