public class Chat {

    public Integer id;
    public String title;
    public Chat(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
    public void openChat(){
        System.out.println("Chat : "+id+" , title : "+title+" : opened");
    }
    public void closeChat() {
        System.out.println("Chat : "+id+" , title : "+title+" : closed");
    }
}
