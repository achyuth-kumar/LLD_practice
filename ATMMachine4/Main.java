public class Main {
    public static void main(String [] args) {
        OperationFactory operationFactory=new OperationFactory();
        Operations operations=operationFactory.createOperation(600);
        ATMService atmService= new ATMServiceImpl(operations);
        atmService.invokeHandler(520);
        atmService.credit(1,520);
        atmService.debit(1,20);
        atmService.viewBalance(0);
        atmService.viewBalance(1);

    }
}
