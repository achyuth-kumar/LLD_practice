public class Player {

    public Integer Id;
    public String name;
    public Pair<Integer,Integer> CurrentPosition;

    public Player(Integer id, String name, Pair<Integer, Integer> currentPosition) {
        Id = id;
        this.name = name;
        CurrentPosition = currentPosition;
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
