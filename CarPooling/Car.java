public interface Car {
    public void Book(int customer_id,int source,int destination);
    public void Exit(int customer_id);
    public int Cost(int customerId);
    public void Start();
    public void Stop();
    public void accelerate();
}
