public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(1,"Achyuth");
        ATMMachine atmMachine=new ATMMachineServiceImpl(new OperationFactory());
        atmMachine.credit(customer.getId(),500);
        atmMachine.debit(customer.getId(), 100);
        atmMachine.viewBalance();

        atmMachine.credit(2,800);
        atmMachine.debit(2, 200);
        atmMachine.viewBalance();

    }
}
