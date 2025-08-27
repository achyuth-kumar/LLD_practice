public class User {
    Command command;
    public void setCommand(Command command) {
        this.command=command;
    }
    public void invokeCommand() {
        command.execute();
    }
}
