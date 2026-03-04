public class HundredHandler extends Operations{
    public HundredHandler(Operations operation) {
        super(operation);
    }

    @Override
    public void processTransactions() {
        System.out.println("Hundred Handler Invoked");
    }
}
