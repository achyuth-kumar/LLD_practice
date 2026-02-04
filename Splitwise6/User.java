import java.util.List;

public class User {
    public Integer id;
    public String name;

    public List<User> Participants;
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<User> getParticipants() {
        return Participants;
    }

    public void setParticipants(List<User> participants) {
        Participants = participants;
    }


}
