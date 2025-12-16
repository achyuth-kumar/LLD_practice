public interface Restaurant {
    public void acceptOrder(Integer CustomerId,Integer FoodId,Integer Quantity);
    public boolean processPayment(Integer CustomerId,Integer FoodId,Integer Amount);
    public void dispenseOrder(Integer CustomerId,Integer FoodId);
}
