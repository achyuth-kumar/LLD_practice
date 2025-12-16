public class Customer {
    public Integer Id;
    public String name;
    public Customer(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

}
