public class User {
    KanbanBoard board;
    User(KanbanBoard board) {
        this.board=board;
    }

    public JiraItem createTask(String input) {
        return board.getJiraTicket(input);
    }
}
