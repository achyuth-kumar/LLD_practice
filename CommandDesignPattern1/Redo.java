public class Redo implements Command{
    Word word;
    Redo(Word word) {
        this.word=word;
    }
    @Override
    public void execute() {
        word.redoWord();
    }
}
