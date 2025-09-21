import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        User user=new User(0,"Achyuth",new ArrayList<>(),new ArrayList<>());
        Tasks task=new Tasks(user);
        task.createIssue(user.getId(), TaskType.ISSUE);
        task.updateIssue(task.storyId);
        task.createIssue(user.getId(), TaskType.ISSUE);
        task.createIssue(user.getId(), TaskType.ISSUE);
        task.getHistory();
    }
}
