import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class AgentRepository {
    public Map<String,Agent> agents=new ConcurrentHashMap<>();
    public Agent save(Agent agent) {
        agents.put(agent.getId(), agent);
        return agent;
    }
    public Optional<Agent> findById(String id) {
        return Optional.ofNullable(agents.get(id));
    }
    public Collection<Agent> findAll() {
        return agents.values();
    }
    public void delete(String id) {
        agents.remove(id);
    }
}

