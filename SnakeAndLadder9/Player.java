import Pair.Pair;

public class Player {

    public Integer id;
    public String name;
    public Pair<Integer,Integer> currentIndex;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.currentIndex = new Pair<Integer, Integer>(0,0);
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

    public Pair<Integer, Integer> getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Pair<Integer, Integer> currentIndex) {
        this.currentIndex = currentIndex;
    }


}

