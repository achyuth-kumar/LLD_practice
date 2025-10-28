public class SecondParty implements Party{
    public Integer id;
    public String name;
    MediatorImpl mediator;
    public SecondParty(Integer id, String name,MediatorImpl mediator) {
        this.id = id;
        this.name = name;
        this.mediator=mediator;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public void RecieveNotification() {
        System.out.println(this.getName()+" :  recieved vote notification");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
