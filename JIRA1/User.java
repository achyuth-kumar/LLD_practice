import java.util.List;

public class User {

    public Integer id;
    public String name;
    public List<Integer> AssignedIssues;
    public List<Integer> resolvedIssues;

    public User(Integer id, String name, List<Integer> assignedIssues, List<Integer> resolvedIssues) {
        this.id = id;
        this.name = name;
        AssignedIssues = assignedIssues;
        this.resolvedIssues = resolvedIssues;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getAssignedIssues() {
        return AssignedIssues;
    }

    public void setAssignedIssues(List<Integer> assignedIssues) {
        this.AssignedIssues = assignedIssues;
    }

    public List<Integer> getResolvedIssues() {
        return resolvedIssues;
    }

    public void setResolvedIssues(List<Integer> resolvedIssues) {
        this.resolvedIssues = resolvedIssues;
    }

}
