public class FiveHundredHandler extends Operations{
    public FiveHundredHandler(Operations operation) {
        super(operation);
    }

    @Override
    public void processTransactions() {
        System.out.println("Hundred Handler Invoked");
    }
}
