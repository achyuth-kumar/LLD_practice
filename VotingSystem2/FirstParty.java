public class FirstParty implements Party{
    public Integer id;
    public String name;
    MediatorImpl mediator;
    public FirstParty(Integer id, String name,MediatorImpl mediator) {
        this.id = id;
        this.name = name;
        this.mediator=mediator;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public void RecieveNotification() {
        System.out.println(this.getName()+" : recieved vote notification");
    }
}
