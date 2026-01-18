public class MyRemote {
    ICommand command,lastCommand;
    public void pressButton(ICommand command) {
        command.execute();
        this.lastCommand=command;
    }
    public void pressUndo() {
        lastCommand.undo();
    }
}
