import java.util.List;

public class AgentWorkHistory {


    public String agentId;
    public String agentName;
    public List<String> currentlyAssigned;
    public List<String> resolved;

    public AgentWorkHistory(String agentId, String agentName, List<String> currentlyAssigned, List<String> resolved) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.currentlyAssigned = currentlyAssigned;
        this.resolved = resolved;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public List<String> getCurrentlyAssigned() {
        return currentlyAssigned;
    }

    public void setCurrentlyAssigned(List<String> currentlyAssigned) {
        this.currentlyAssigned = currentlyAssigned;
    }

    public List<String> getResolved() {
        return resolved;
    }

    public void setResolved(List<String> resolved) {
        this.resolved = resolved;
    }

}
