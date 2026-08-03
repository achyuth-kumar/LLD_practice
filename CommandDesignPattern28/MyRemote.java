public class MyRemote {
    ICommand command;

    public MyRemote(ICommand command) {
        this.command = command;
    }

    public void presButton() {
        command.execute();
    }
    public void pressUndo() {
        command.undo();
    }
}
