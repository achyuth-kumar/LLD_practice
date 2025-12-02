public class OperationFactory {
    public Operations getOperation(int amount) {
        if(amount>=1000 && amount%1000==0) {
            return new thousandHandler();
        } else if(amount >=500 && amount%500==0) {
            return new fiveHundredHandler();
        } else if(amount>=100 && amount%100==0) {
            return new hundredHandler();
        }
        return null;
    }
}
