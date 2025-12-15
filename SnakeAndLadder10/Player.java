import Pair.Pair;

public class Player {
    public Integer ID;
    public String Name;
    public Pair<Integer,Integer> currentIndex;

    public Player(String name, Integer ID) {
        this.Name = name;
        this.ID = ID;
        this.currentIndex=new Pair<Integer, Integer>(0,0);
    }
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Pair<Integer, Integer> getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Pair<Integer, Integer> currentIndex) {
        this.currentIndex = currentIndex;
    }



}
