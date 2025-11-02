public class PartyServiceImpl implements Party {
    public Integer id;
    public String name;

    public PartyServiceImpl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void RecieveNotification() {
        System.out.println(this.name+" Recieved vote notification");
    }

    @Override
    public String GetName() {
        return this.name;
    }
}
