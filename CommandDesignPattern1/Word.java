public class Word {
    Boolean undoRedo;
    public void undoWod() {
        this.undoRedo=true;
        System.out.println("text undo done");
    }
    public void redoWord() {
        this.undoRedo=false;
        System.out.println("text redo done");
    }
}
