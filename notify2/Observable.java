public class Observable implements Observer {
    @Override
    public void add(){
        System.out.println("Item got added");
    }   
    @Override
    public void remove(){
        System.out.println("Item removed from cart");
    }
    @Override
    public void notify1(){
        System.out.println("Email notification have been sent");
    }
    
}