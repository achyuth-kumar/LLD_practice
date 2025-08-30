import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Memento> mementoList=new ArrayList<>();
        IMemento mementoImpl= new MementoImpl(mementoList);
        Memento memento=new Memento(1,2);
        ICommand command=new AddMemento(new MementoImpl(mementoList));
        MyRemote remote=new MyRemote(command);
        remote.invokeCommand(memento);

        memento=new Memento(3,4);
        command=new AddMemento(new MementoImpl(mementoList));
        remote=new MyRemote(command);
        remote.invokeCommand(memento);
        mementoImpl.getMementos();

        System.out.println("Revert : ");
        memento=new Memento(3,4);
        command=new RevertMemento(new MementoImpl(mementoList));
        remote=new MyRemote(command);
        remote.invokeCommand(memento);
        mementoImpl.getMementos();

    }
}
