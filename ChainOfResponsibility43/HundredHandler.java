public class HundredHandler extends Operations{
    public HundredHandler(Operations next) {
        super(next);
    }

    @Override
    public void processTransactions(Integer amount) {
        if(amount>=100) {
            Integer notes=amount/100;
            Integer remainder=amount%100;
            System.out.println("Hundred Notes : "+notes);
            if(remainder!=0 && next!=null) {
                next.processTransactions(remainder);
            }
        }
        else {
            next.processTransactions(amount);
        }
    }
}
