public class RevertMemento implements ICommand{
    MementoImpl mementoImpl;
    RevertMemento(MementoImpl mementoImpl) {
        this.mementoImpl=mementoImpl;
    }
    @Override
    public void execute(Memento memento) {
        mementoImpl.revertMemento(memento);
    }
}
