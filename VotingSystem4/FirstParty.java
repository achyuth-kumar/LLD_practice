public class FirstParty implements Party{
    public String name;

    public FirstParty(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void ReceiveNotification() {
        System.out.println(this.name+" party recieved vote notification");
    }
}
