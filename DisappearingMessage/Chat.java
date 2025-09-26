public class Chat {
    public boolean open;
    public void OpenChat() {
        if(this.open) {
            System.out.println("Chat is already closed");
        }
        this.open=true;
    }
    public void CloseChat() {
        if(!this.open) {
            System.out.println("Chat is already closed");
        }
        this.open=false;
    }

}
