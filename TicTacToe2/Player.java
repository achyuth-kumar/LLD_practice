import Pair.Pair;

public class Player {

    public int id;
    public String name;
    public Pair<Integer,Integer> CurrentIndex;
    public Piece type;
    public Player(int id, String name,Piece type) {
        this.id = id;
        this.name = name;
        this.type=type;
        this.CurrentIndex = new Pair<Integer, Integer>(0,0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pair<Integer, Integer> getCurrentIndex() {
        return CurrentIndex;
    }

    public void setCurrentIndex(Pair<Integer, Integer> currentIndex) {
        CurrentIndex = currentIndex;
    }



}
