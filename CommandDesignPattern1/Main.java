public class Main {
    public static void main(String [] args) {
        Word word=new Word();
        Command command=new Undo(word);
        User user=new User(command);
        user.invokeCommand();

        command=new Redo(word);
        user=new User(command);
        user.invokeCommand();

    }
}
