public class Player {

    public Integer id;
    public String name;
    public Pair<Integer,Integer> CurrentPosition;

    public Player(Integer id, String name, Pair<Integer, Integer> currentPosition) {
        this.id = id;
        this.name = name;
        CurrentPosition = currentPosition;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pair<Integer, Integer> getCurrentPosition() {
        return CurrentPosition;
    }

    public void setCurrentPosition(Pair<Integer, Integer> currentPosition) {
        CurrentPosition = currentPosition;
    }
}
