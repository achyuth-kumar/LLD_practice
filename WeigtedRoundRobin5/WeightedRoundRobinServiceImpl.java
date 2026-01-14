import java.util.List;

public class WeightedRoundRobinServiceImpl implements  WeightedRoundRobin{


    List<String> Servers;
    List<Integer> Weights;
    Integer CurrentWeight,CurrentIndex;
    public WeightedRoundRobinServiceImpl(List<String> servers, List<Integer> weights) {
        this.Servers = servers;
        this.Weights = weights;
        this.CurrentIndex=-1;
        this.CurrentWeight=0;
    }
    @Override
    public String getNextServer() {
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
