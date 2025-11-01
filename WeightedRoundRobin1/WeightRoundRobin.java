import java.util.List;

public class WeightRoundRobin {
    List<String> servers;
    List<Integer> weights;
    Integer CurrentIndex=-1,CurrentWeight=0;
    WeightRoundRobin(List<String> servers,List<Integer> weights) {
        this.servers=servers;
        this.weights=weights;
    }
    public String GetNextServer() {
        while(true) {
            CurrentIndex=(CurrentIndex+1)%servers.size();
            if(CurrentIndex==0) {
                this.CurrentWeight-=1;
                if(this.CurrentWeight<=0) {
                    this.CurrentWeight=weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(weights.get(CurrentIndex)>=CurrentWeight) {
                return servers.get(CurrentIndex);
            }
        }
    }
}
