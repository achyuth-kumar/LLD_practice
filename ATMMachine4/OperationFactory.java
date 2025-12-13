public class OperationFactory {
    public Operations createOperation(Integer amount) {
        if(amount>=1000) {
            return new ThousandHandler();
        }
        else if(amount>=500) {
            return new FiveHundredHandler();
        }
        return new HundredHandler();
    }
}
