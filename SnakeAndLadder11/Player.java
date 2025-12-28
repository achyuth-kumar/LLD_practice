import Pair.Pair;

public class Player {

    public Integer id;
    public String name;
    public Pair<Integer,Integer> position;

    public Player(String name, Integer id) {
        this.name = name;
        this.id = id;
        this.position=new Pair<Integer, Integer>(0,0);
        this.position.first=0;
        this.position.second=0;
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

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public void setPosition(Pair<Integer, Integer> position) {
        this.position = position;
    }



}
