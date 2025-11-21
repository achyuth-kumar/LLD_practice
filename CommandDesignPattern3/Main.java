public class Main {
    public static void main(String [] args) {
        ICommand undoService=new undoServiceImpl(new ACServiceImpl());
        ICommand redoService=new redoServiceImpl(new ACServiceImpl());
        MyRemote remote=new MyRemote();
        remote.invokeCommand(undoService);
        remote.invokeCommand(redoService);
        remote.invokeCommand(undoService);
    }
}
