public class TwoThousandHandler extends Operations {
    public TwoThousandHandler(Operations next) {
        super(next);
    }

    @Override
    public void processTransactions(Integer amount) {
        if(amount>=2000) {
            Integer remainder=amount%2000;
            Integer notes=amount/2000;
            System.out.println("Two Thousand Notes : "+notes);
            if(next!=null && amount!=0) {
                next.processTransactions(remainder);
            }
        }
        else {
            next.processTransactions(amount);
        }
    }
}
