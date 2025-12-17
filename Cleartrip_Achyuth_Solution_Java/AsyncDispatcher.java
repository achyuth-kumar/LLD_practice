import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncDispatcher {
    public ExecutorService executor= Executors.newFixedThreadPool(10);
    public void dispatch(Runnable task) {
        executor.submit(task);
    }

}
