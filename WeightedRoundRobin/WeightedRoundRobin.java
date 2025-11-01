import java.util.List;

public class WeightedRoundRobin {
    List<String> servers;
    List<Integer> weights;
    Integer CurrentIndex,CurrentWeight;
    WeightedRoundRobin(List<String> servers,List<Integer> weights) {
        this.servers=servers;
        this.weights=weights;
        this.CurrentIndex=-1;
        this.CurrentWeight=0;
    }
    public String GetNextServer() {
        while(true) {
            this.CurrentIndex=(this.CurrentIndex+1)%servers.size();
            if(this.CurrentIndex==0){
                this.CurrentWeight-=1;
                if(this.CurrentWeight<=0) {
                    this.CurrentWeight=weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(weights.get(CurrentIndex)>=this.CurrentWeight) {
                return this.servers.get(CurrentIndex);
            }
        }
    }
}
