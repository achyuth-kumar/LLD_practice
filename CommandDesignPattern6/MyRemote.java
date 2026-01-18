public class MyRemote {
    boolean undo=true;
    public void pressButton() {
        ICommand command;
        if(undo) {
            command=new undoServiceImpl(new AirConditionerServiceImpl());
            command.execute();
        }
        else if(!undo) {
            command=new redoServiceImpl(new AirConditionerServiceImpl());
            command.execute();
        }
        undo=!undo;
    }
}
