public interface IMemento {
    public void addMemento(Memento memento);
    public void revertMemento(Memento memento);
    public void getMementos();
}
