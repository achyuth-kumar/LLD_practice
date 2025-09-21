import java.util.List;
import java.util.Random;

public class Tasks {

    public Integer storyId,assignId;
    public IssueStatus status;
    public TaskType type;

    User user;
    Tasks(User user) {
        this.user=user;
    }

    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    public Integer getAssignId() {
        return assignId;
    }

    public void setAssignId(Integer assignId) {
        this.assignId = assignId;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public void setStatus(IssueStatus status) {
        this.status = status;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Tasks(Integer storyId, Integer assignId, IssueStatus status, TaskType type) {
        this.storyId = storyId;
        this.assignId = assignId;
        this.status = status;
        this.type = type;
    }

    public void createIssue(Integer assignId,TaskType taskType) {
        int n=3;
        Random random=new Random();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++) {
            s.append(random.nextInt(n));
        }
        this.storyId=Integer.parseInt(s.toString());
        Tasks newTask=new Tasks(this.storyId,assignId,IssueStatus.OPEN,TaskType.ISSUE);
        user.getAssignedIssues().add(this.storyId);
        System.out.println(newTask.getStoryId()+" got created");
    }
    public void updateIssue(Integer storyId) {
        Tasks newTasks=new Tasks(storyId,this.assignId,IssueStatus.CLOSED,TaskType.ISSUE);
        user.getAssignedIssues().remove(storyId);
        user.getResolvedIssues().add(storyId);
        System.out.println(newTasks.getStoryId()+" got closed");
    }
    public void getHistory() {
        System.out.println("Assigned issues");
        for(Integer taskId : this.user.AssignedIssues) {
            System.out.println(taskId);
        }
        System.out.println("Resovled issues");
        for(Integer taskId : this.user.getResolvedIssues()) {
            System.out.println(taskId);
        }

    }
}
