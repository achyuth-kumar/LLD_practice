import java.time.Instant;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Set;

public class IssueFilter {
    private Set<IssueStatus> statuses;
    private Set<IssueType> types;
    private String agentId;
    private Instant from,to;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Set<IssueStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<IssueStatus> statuses) {
        this.statuses = statuses;
    }

    public Set<IssueType> getTypes() {
        return types;
    }

    public void setTypes(Set<IssueType> types) {
        this.types = types;
    }

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public Instant getTo() {
        return to;
    }

    public void setTo(Instant to) {
        this.to = to;
    }
    public boolean matches(Issue issue) {
        if(statuses!=null && !statuses.isEmpty() && !statuses.contains((issue.getStatus()))) {
            return false;
        }
        if(types!=null && !types.isEmpty() && types.contains(issue.getIssueType())) {
            return false;
        }
        if(agentId!=null && !agentId.equals(issue.getAssignedAgentEmail())) {
            return false;
        }
        if(from!=null && issue.getCreatedAt().isBefore(from)) {
            return false;
        }
        if(to!=null && issue.getCreatedAt().isAfter(to)){
            return false;
        }
        return true;
    }

}
