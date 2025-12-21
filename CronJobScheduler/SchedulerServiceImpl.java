import java.util.HashMap;
import java.util.Map;

public class SchedulerServiceImpl implements Scheduler{

    Integer index;
    HashMap<Integer,Task> scheduler;
    public SchedulerServiceImpl() {
        this.scheduler = new HashMap<>();
        this.index=0;
    }
    @Override
    public void create(Task task) {
        scheduler.put(index++,task);
        System.out.println(task.getName()+" : Got Created");
    }

    @Override
    public void update(Integer id, Task task) {
        scheduler.put(id,task);
        System.out.println(task.getName()+" : GOT updated");
    }

    @Override
    public void delete(Integer id) {
        scheduler.remove(id);
    }

    @Override
    public void listAll() {
        System.out.println("ALL JOBS : ");
        for(Map.Entry<Integer,Task> entry : scheduler.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue().getName());
        }
    }
}
