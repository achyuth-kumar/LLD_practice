public class Player {
    Integer id;
    String name;
    Pair<Integer,Integer> currentPosition;
    public Player(Integer id, String name, Pair<Integer, Integer> currentPosition) {
        this.id = id;
        this.name = name;
        this.currentPosition = currentPosition;
    }

    public Pair<Integer, Integer> getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Pair<Integer, Integer> currentPosition) {
        this.currentPosition = currentPosition;
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
