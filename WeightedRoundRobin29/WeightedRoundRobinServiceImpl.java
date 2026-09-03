import java.util.List;

public class WeightedRoundRobinServiceImpl implements WeightedRoundRobin{
    Integer currentIndex,currentWeight;
    List<String> servers;
    List<Integer> weights;
    public WeightedRoundRobinServiceImpl(Integer currentIndex, Integer currentWeight, List<String> servers, List<Integer> weights) {
        this.currentIndex = currentIndex;
        this.currentWeight = currentWeight;
        this.servers = servers;
        this.weights = weights;
    }
    @Override
    public String getNextServer() {
        while (true) {
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
