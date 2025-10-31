import Pair.Pair;

public class Player {
    public Integer id;
    public String name;
    public Pair<Integer,Integer> CurrentPosition=new Pair<Integer,Integer>();
    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.CurrentPosition =new Pair<Integer, Integer>(0,0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCurrentPosition(Pair<Integer, Integer> currentPosition) {
        this.CurrentPosition = currentPosition;
    }



    public String getName() {
        return name;
    }

    public Pair<Integer, Integer> getCurrentPosition() {
        return CurrentPosition;
    }

    public Integer getId() {
        return id;
    }




}
