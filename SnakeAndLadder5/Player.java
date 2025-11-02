import Pair.Pair;

public class Player {

    public Integer id;
    public String name;
    public Pair<Integer,Integer> CurrentIndex;


    public Player(Integer id,String name) {
        this.name = name;
        this.id = id;
        this.CurrentIndex=new Pair<Integer, Integer>(0,0);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentIndex(Pair<Integer, Integer> currentIndex) {
        CurrentIndex = currentIndex;
    }


    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Pair<Integer, Integer> getCurrentIndex() {
        return CurrentIndex;
    }
}
