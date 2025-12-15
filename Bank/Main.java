public class Main {
    public static void main(String [] args) {
        Customer customer=new CustomerServiceImpl();
        customer.credit(1,5000);
        customer.debit(1,7000);
        customer.debit(1,2000);
        customer.viewBalance(1);
    }
}
