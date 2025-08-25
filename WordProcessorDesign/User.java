public class User {
    int id;
    String name;
    User(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public void createUser() {
        System.out.println(this.name+" user created successfully");
    }
    public void login() {
        System.out.println(this.name+" user loggedin successfully");
    }
}
