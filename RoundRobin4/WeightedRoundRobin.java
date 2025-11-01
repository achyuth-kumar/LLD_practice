import java.util.List;

public class WeightedRoundRobin {
    List<String> servers;
    List<Integer> weights;
    Integer CurrentIndex=-1,CurrentWeight=0;
    WeightedRoundRobin(List<String> servers,List<Integer> weights) {
        this.servers=servers;
        this.weights=weights;
    }
    public String GetNextServer() {
        while(true) {
            CurrentIndex=(CurrentIndex+1)%servers.size();
            if(CurrentIndex==0) {
                CurrentWeight-=1;
                if(CurrentWeight<=0) {
                    CurrentWeight=weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(weights.get(CurrentIndex)>=CurrentWeight) {
                return servers.get(CurrentIndex);
            }
        }
    }
}
