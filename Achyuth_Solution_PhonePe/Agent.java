import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Agent {
    private String id;

    private String agentName;
    private List<String> skills;
    private List<String> assignedIssueIds=new ArrayList<>();
    private List<String> resolvedIssueIds=new ArrayList<>();
    private Instant createdAt;

    public Agent(String id, String agentName, List<String> skills, List<String> assignedIssueIds, List<String> resolvedIssueIds, Instant createdAt) {
        this.id = id;
        this.agentName = agentName;
        this.skills = skills;
        this.assignedIssueIds = assignedIssueIds;
        this.resolvedIssueIds = resolvedIssueIds;
        this.createdAt = createdAt;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getAssignedIssueIds() {
        return assignedIssueIds;
    }

    public void setAssignedIssueIds(List<String> assignedIssueIds) {
        this.assignedIssueIds = assignedIssueIds;
    }

    public List<String> getResolvedIssueIds() {
        return resolvedIssueIds;
    }

    public void setResolvedIssueIds(List<String> resolvedIssueIds) {
        this.resolvedIssueIds = resolvedIssueIds;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }





}
