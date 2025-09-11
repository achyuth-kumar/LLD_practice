public class KanbanBoard {
    public JiraItem getJiraTicket(String input) {
        if(input.equals("bug")) {
            return new Bug();
        }
        else if(input.equals("story")) {
            return new Story();
        }
        else if(input.equals("task")) {
            return new Task();
        }
        return null;
    }
}
