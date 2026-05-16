import java.util.List;

public class WeightedRoundRobinServiceImpl implements WeightedRoundRobin{


    List<String> servers;
    List<Integer> weights;
    Integer currentWeight,currentIndex;
    public WeightedRoundRobinServiceImpl(List<String> servers, List<Integer> weights, Integer currentWeight, Integer currentIndex) {
        this.servers = servers;
        this.weights = weights;
        this.currentWeight = currentWeight;
        this.currentIndex = currentIndex;
    }
    @Override
    public String getNextServer() {
        while(true) {
            currentIndex=(currentIndex+1)%servers.size();
            if(currentIndex==0) {
                currentWeight--;
                if(currentWeight<=0) {
                    currentWeight=weights.stream().max(Integer::compare).orElse(0);
                }
            }
            if(weights.get(currentIndex)>=currentWeight) {
                return servers.get(currentIndex);
            }
        }
    }
}
