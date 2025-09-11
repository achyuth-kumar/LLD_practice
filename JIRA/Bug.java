import java.util.Random;

public class Bug implements  JiraItem{
    public String title,Description,Status,Assignee;
    public int StoryPoints,jiraID;
    Bug() {

    }
    Bug(String title,String Description,int StoryPoints,String Status,String Assignee) {
        this.title=title;
        this.Description=Description;
        this.StoryPoints=StoryPoints;
        this.Status=Status;
        int n=5;
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        for(int i=0;i<n;i++) {
            s.append(random.nextInt(n));
        }
        this.jiraID=Integer.parseInt(s.toString());
        this.Assignee=Assignee;
    }

    @Override
    public int getJiraID() {
        return this.jiraID;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescrption() {
        return this.Description;
    }

    @Override
    public int getStoryPoints() {
        return this.StoryPoints;
    }

    @Override
    public String getStatus() {
        return this.Status;
    }

    @Override
    public String getAssignee() {
        return this.Assignee;
    }

    public void setAssignee(String assignee) {
        Assignee = assignee;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setStoryPoints(int storyPoints) {
        StoryPoints = storyPoints;
    }

}
