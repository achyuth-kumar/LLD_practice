public class AddMemento implements ICommand{
    MementoImpl mementoImpl;
    AddMemento(MementoImpl mementoImpl) {
        this.mementoImpl=mementoImpl;
    }
    @Override
    public void execute(Memento memento) {
        mementoImpl.addMemento(memento);
    }
}
