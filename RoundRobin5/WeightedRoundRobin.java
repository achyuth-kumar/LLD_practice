import java.util.List;

public class WeightedRoundRobin {
    List<String> Servers;
    List<Integer> Weights;
    Integer CurrentIndex=-1,CurrentWeight=0;
    WeightedRoundRobin(List<String> Servers,List<Integer> Weights) {
        this.Servers=Servers;
        this.Weights=Weights;
    }
    public String GetNextServer() {
        while(true) {
            CurrentIndex=(CurrentIndex+1)%Servers.size();
            if(CurrentIndex==0) {
                CurrentWeight-=1;
                if(CurrentWeight<=0) {
                    CurrentWeight=Weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(Weights.get(CurrentIndex)>=CurrentWeight) {
                return Servers.get(CurrentIndex);
            }
        }
    }
}
