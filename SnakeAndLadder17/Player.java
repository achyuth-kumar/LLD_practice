public class Player {

    public Integer id;
    public String name;
    public Pair<Integer,Integer> currentPosition;
    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.currentPosition=new Pair<>(0,0);
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

    public Pair<Integer, Integer> getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Pair<Integer, Integer> currentPosition) {
        this.currentPosition = currentPosition;
    }

}
