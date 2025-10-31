public class SecondParty implements Party{
    public String name;

    public SecondParty(String name) {
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
