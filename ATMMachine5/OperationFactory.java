public class OperationFactory {
    public OperationStrategy createOperationHandler(Integer amount) {
        if(amount<=100) {
            return new HundredHandler();
        }
        else if(amount>100 && amount<=500) {
            return new FiveHundredHandler();
        }
        else if(amount>500) {
            return new ThousandHandler();
        }
        return null;
    }

}
