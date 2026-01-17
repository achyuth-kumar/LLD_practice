public class Main {
    public static void main(String[] args) {
        ICommand undo=new undoServiceImpl(new AirConditionerServiceImpl());
        ICommand redo=new redoServiceImpl(new AirConditionerServiceImpl());
        MyRemote remote=new MyRemote(undo);
        remote.pressButton();
        remote=new MyRemote(redo);
        remote.pressButton();

    }
}
