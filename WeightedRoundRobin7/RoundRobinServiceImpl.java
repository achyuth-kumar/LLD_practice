import java.util.*;
public class RoundRobinServiceImpl implements RoundRobin{
    List<String> servers;
    List<Integer> weights;
    Integer currentWeight,currentIndex;
    public RoundRobinServiceImpl(List<String> servers, List<Integer> weights) {
        this.servers = servers;
        this.weights = weights;
        this.currentIndex=-1;
        this.currentWeight=0;
    }
    @Override
    public String getNextServer() {
        while(true) {
            currentIndex=(currentIndex+1)%servers.size();
            if(currentIndex==0) {
                currentWeight-=1;
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
