public class MyRemote {

    ICommand command;
    public MyRemote(ICommand command) {
        this.command = command;
    }

    public void invokeCommand() {
        command.execute();
    }
}
