public class TwoThousandHandler extends Operations{
    public TwoThousandHandler(Operations next) {
        super(next);
    }

    @Override
    public void processTransactions(Integer amount) {
        if(amount%100!=0) {
            System.out.println("Please enter amount in 100s");
            return ;
        }
        if(amount>=2000) {
            Integer notes=amount/2000;
            Integer remainder=amount%2000;
            System.out.println("Two THousand notes : "+notes);
            if(remainder!=0 && next!=null) {
                next.processTransactions(remainder);
            }
        }
        else {
            next.processTransactions(amount);
        }
    }
}
