public interface Scheduler {
    public void create(Task task);
    public void update(Integer id,Task task);
    public void delete(Integer id);
    public void listAll();
}
