public class ThousandHandler implements OperationStrategy{
    @Override
    public void processTransaction() {
        System.out.println("Thousand handler invoked");
    }
}
