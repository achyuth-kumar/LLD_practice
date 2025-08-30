import java.util.ArrayList;
import java.util.List;

public class MementoImpl implements IMemento{
    List<Memento> history=new ArrayList<>();
    MementoImpl(List<Memento> mementoList) {
        this.history=mementoList;
    }
    @Override
    public void addMemento(Memento memento) {
        this.history.add(memento);
    }

    @Override
    public void revertMemento(Memento memento) {
        int lastIndex=history.size()-1;
        this.history.remove(lastIndex);
    }

    @Override
    public void getMementos() {
        for(Memento memento : this.history) {
            System.out.println(memento.getHeight()+" : "+memento.getWidth());
        }
    }
}
