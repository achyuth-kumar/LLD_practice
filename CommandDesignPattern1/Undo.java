public class Undo implements Command{
    Word word;
    Undo(Word word) {
        this.word=word;
    }
    @Override
    public void execute() {
        word.undoWod();
    }
}
