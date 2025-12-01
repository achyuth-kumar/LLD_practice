public class Main {
    public static void main(String [] args) {
        MyRemote remote=new MyRemote();
        remote.invokeCommand(new undoServiceImpl());
        remote.invokeCommand(new redoServiceImpl());

        remote.invokeCommand(new undoServiceImpl());
        remote.invokeCommand(new redoServiceImpl());

        remote.invokeCommand(new undoServiceImpl());
        remote.invokeCommand(new redoServiceImpl());

    }
}
