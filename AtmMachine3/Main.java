import jdk.dynalink.Operation;

public class Main {
    public static void main(String [] args) {
        ATMService atmService=new ATMServiceImpl();
        OperationFactory operationFactory=new OperationFactory();
        Operations operations= operationFactory.getOperation(500);
        atmService.credit(1,500,operations);
        atmService.debit(1,150);
        atmService.viewBalance(1);

        atmService.credit(2,100,operations);
        atmService.debit(2,150);
        atmService.viewBalance(2);

    }
}
