import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Main {
    public static void main(String [] args) {
        IssueRepository issueRepository=new IssueRepository();
        AgentRepository agentRepository=new AgentRepository();
        IssueService service=new IssueService(issueRepository,agentRepository);
        Agent a1=new Agent(UUID.randomUUID().toString(),"Achyuth",Arrays.asList("A1"), Arrays.asList("payments","billing"),Arrays.asList("A2"), java.time.Instant.now());
        Agent a2=new Agent(UUID.randomUUID().toString(),"Kumar",Arrays.asList("B1"), Arrays.asList("returns ","cart"),Arrays.asList("B2"), java.time.Instant.now());

        agentRepository.save(a1);
        agentRepository.save(a2);
        Issue i1=service.createIssue("txt1",IssueType.TECHNICAL,"Payment failed","Card declined","customer1@gmail.com");
        Issue i2=service.createIssue("txt1",IssueType.TECHNICAL,"order cancelled","Card declined","customer2@gmail.com");
        service.assignIssues(i1.getIssueId(), a1.getId());
        service.assignIssues(i2.getIssueId(), a2.getId());
        service.resolbveIssue(i1.getIssueId(),"Cards issue");
        IssueFilter filter=new IssueFilter();
        filter.setStatuses(Set.of(IssueStatus.OPEN,IssueStatus.ASSIGNED));
        List<Issue> open=service.getIssues(filter);
        AgentWorkHistory workHistory=service.viewAgentWorkHistory(a1.getId());
        System.out.println(workHistory.getResolved().size());
    }
}
