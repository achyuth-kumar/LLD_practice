public class User {
    Command command;
    User(Command command) {
        this.command=command;
    }
    public void invokeCommand() {
        command.execute();
    }
}
