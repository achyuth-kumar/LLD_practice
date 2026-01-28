import java.util.List;

public class roundRobinServiceImpl implements roundRobin{


    List<String> Servers;
    List<Integer> Weights;
    Integer currentWeight,currentIndex;
    public roundRobinServiceImpl( List<String> servers,List<Integer> weights) {
        this.Weights = weights;
        this.Servers = servers;
        this.currentWeight=0;
        this.currentIndex=-1;
    }
    @Override
    public String getNextServer() {
        while(true) {
            currentIndex=(currentIndex+1)% Servers.size();
            if(currentIndex==0) {
                currentWeight-=1;
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
