public class Task {
    public Integer id;
    public String name;
    public String details;

    public Task(Integer id, String name, String details) {
        this.id = id;
        this.name = name;
        this.details = details;
    }
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
