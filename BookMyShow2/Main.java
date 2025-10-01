public class Main {
    public static void main(String [] args) {
        Customer customer=new Customer(1,"Achyuth");
        Book book=new Book();
        book.ProcessBooking(customer.getId(),0,10,0);
        Customer customer2=new Customer(2,"Kumar");
        book.ProcessBooking(customer2.getId(),1,10,0);

    }
}
