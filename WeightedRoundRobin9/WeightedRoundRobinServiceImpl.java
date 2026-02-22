import java.util.List;

public class WeightedRoundRobinServiceImpl implements WeightedRoundRobin{

    List<String> Servers;
    List<Integer> Weights;
    Integer currentIndex,currentWeight;
    public WeightedRoundRobinServiceImpl(List<String> servers, List<Integer> weights) {
        this.Servers = servers;
        this.Weights = weights;
        this.currentWeight=0;
        this.currentIndex=-1;
    }
    @Override
    public String getNextServer() {
        while(true) {
            currentIndex=(currentIndex+1)%Servers.size();
            if(currentIndex==0) {
                currentWeight--;
                if(currentWeight<=0) {
                    currentWeight=Weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(Weights.get(currentIndex)>=currentWeight) {
                return Servers.get(currentIndex);
            }
        }
    }
}
