public class User {
    public Integer Id;
    public String name;


    public Access access;

    public User(Integer id, String name, Access access) {
        this.Id = id;
        this.name = name;
        this.access = access;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
    public Access getAccess() {
        return access;
    }




}
