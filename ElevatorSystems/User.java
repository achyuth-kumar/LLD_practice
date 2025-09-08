public class User {
    public int id;
    public String name;
    User(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
