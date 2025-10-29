import Pair.Pair;

public class Player {
    public Integer id;
    public String name;



    Pair<Integer,Integer> CurrentValue;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.CurrentValue=new Pair<Integer, Integer>(0,0);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setCurrentValue(Pair<Integer, Integer> currentValue) {
        this.CurrentValue = currentValue;
    }
    public Pair<Integer, Integer> getCurrentValue() {
        return CurrentValue;
    }


}
