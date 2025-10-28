import Pair.Pair;

public class Player {
    public Integer id;
    public String name;
    public Pair<Integer,Integer> CurrentValue;
    public Player(Integer id, String name,Pair<Integer,Integer> CurrentValue) {
        this.id = id;
        this.name = name;
        this.CurrentValue=CurrentValue;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Pair<Integer,Integer> getCurrentValue() {
        return this.CurrentValue;
    }


}
