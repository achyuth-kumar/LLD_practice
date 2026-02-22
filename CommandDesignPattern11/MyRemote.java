public class MyRemote {

    ICommand command;
    public MyRemote(ICommand command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
    public void pressUndo() {
        command.undo();
    }
}
