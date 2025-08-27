public class Main {
    public static void main(String[] args) {
        Word word=new Word();
        Command undo=new Undo(word);
        User user=new User();
        user.setCommand(undo);
        user.invokeCommand();

        Command redo=new Redo(word);
        user=new User();
        user.setCommand(redo);
        user.invokeCommand();

    }
}
