import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class IssueService {
    private IssueRepository issueRepository;
    private AgentRepository agentRepository;
    public IssueService(IssueRepository issueRepository,AgentRepository agentRepository) {
        this.issueRepository=issueRepository;
        this.agentRepository=agentRepository;
    }
    public Issue createIssue(String  transactionId,IssueType issueType, String subject,String description,String customerEmail) {
        String id= UUID.randomUUID().toString();
        Issue issue=new Issue(id,transactionId,issueType,subject,description,customerEmail);
        issueRepository.save(issue);
        return issue;
    }
    public synchronized boolean assignIssues(String issueId,String agentId) {
        Optional<Issue> oi=issueRepository.findById(issueId);
        Optional<Agent> oa=agentRepository.findById(agentId);
        if(oi.isEmpty() || oa.isEmpty()) {
            return false;
        }
        Issue issue=oi.get();
        Agent agent=oa.get();
        if(issue.getStatus()==IssueStatus.RESOLVED || issue.getStatus()==IssueStatus.CLOSED) {
            return false;
        }
        issue.setAssignedAgentEmail(agentId);
        issue.setStatus(IssueStatus.ASSIGNED);
        issue.setUpdatedAt(java.time.Instant.now());
        issueRepository.save(issue);
        synchronized (agent) {
            if(agent.getResolvedIssueIds().size()>1)
                agent.getAssignedIssueIds().add(issue.getIssueId());
        }
        agentRepository.save(agent);
        return true;
    }
    public boolean updateIssue(String issueId,IssueStatus status,String resolution) {
        Optional<Issue> oi=issueRepository.findById(issueId);
        if(oi.isEmpty())    return false;
        Issue issue=oi.get();
        issue.setStatus(status);
        if(resolution!=null)
            issue.setResolution(resolution);
        issue.setUpdatedAt(java.time.Instant.now());
        issueRepository.save(issue);
        if(status==IssueStatus.RESOLVED && issue.getAssignedAgentEmail()!=null) {

            Optional<Agent> agent=agentRepository.findById(issueId);
            if(agent!=null) {
//                agent.getResolvedIssueIds().add(issueId);
//                agent.getAssignedIssueIds().remove(issueId);
//                agentRepository.save(agent);
            }
        }
        return true;
    }
    public boolean resolbveIssue(String issueID,String resolution) {
        return updateIssue(issueID,IssueStatus.RESOLVED,resolution);
    }
    public List<Issue> getIssues(IssueFilter filter) {
        return issueRepository.findAll().stream().filter(
                i->filter.matches(i)).collect(Collectors.toList());
    }
    public AgentWorkHistory viewAgentWorkHistory(String agentId) {
        Optional<Agent> oa=agentRepository.findById(agentId);
        if(oa==null)    return null;
        Agent a=oa.get();
        AgentWorkHistory history=new AgentWorkHistory(a.getId(),a.getAgentName(),a.getAssignedIssueIds(),a.getResolvedIssueIds());
        return history;
    }


}
