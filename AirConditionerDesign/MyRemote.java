public class MyRemote {
    public void invokeCommand(ICommand command){
        command.execute();
    }
}
