public class MyRemote {
    ICommand command;
    MyRemote(ICommand command) {
        this.command=command;
    }
    public void invokeCommand(Memento memento) {
        command.execute(memento);
    }
}
