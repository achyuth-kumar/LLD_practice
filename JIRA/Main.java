public class Main {
    public static void main(String [] args) {
        User user=new User(new KanbanBoard());
        JiraItem bug=user.createTask("bug");
        bug=new Bug("Uniqueness bug","Demo Story",5,"Under progress","Achyuth");
        System.out.println("Task details : ");
        System.out.println(bug.getJiraID()+" : "+bug.getTitle()+" : "+bug.getDescrption()+" : "+bug.getStoryPoints()+" : "+bug.getStatus()+" : "+bug.getAssignee());
        TimeSheet timeSheet=new TimeSheet();
        timeSheet.logEfforts(bug,8);
        timeSheet.displayEfforts();
    }
}
