import java.util.List;

public class RoundRobinServiceImpl implements RoundRobin{
    List<Integer> Weights;
    List<String> Servers;
    Integer CurrentWeight,CurrentIndex;
    public RoundRobinServiceImpl(List<Integer> weights, List<String> servers) {
        this.Weights = weights;
        this.Servers = servers;
        this.CurrentWeight=0;
        this.CurrentIndex=-1;
    }

    @Override
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
