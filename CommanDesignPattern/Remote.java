public class Remote {
    ICommand command;
    Remote(ICommand command) {
        this.command=command;
    }
    public void invokeCommand() {
        command.execute();
    }
}
