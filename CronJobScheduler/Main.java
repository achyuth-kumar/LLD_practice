public class Main {
    public static void main(String [] args) {
        Scheduler scheduler=new SchedulerServiceImpl();
        Task task=new Task(1,"DST","DST handler");
        scheduler.create(task);
        task=new Task(1,"Github","Github Actions");
        scheduler.update(task.getId(),task);
        scheduler.listAll();
        scheduler.delete(0);
        scheduler.listAll();
    }
}
