import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class IssueRepository {
    public Map<String,Issue> issues=new ConcurrentHashMap<>();
    public Issue save(Issue issue) {
        issues.put(issue.getIssueId(), issue);
        return issue;
    }
    public Optional<Issue> findById(String id) {
        return Optional.ofNullable(issues.get(id));
    }
    public Collection<Issue> findAll() {
        return issues.values();
    }
    public void delete(String id) {
        issues.remove(id);
    }

}
