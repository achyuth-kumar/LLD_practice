public class FiveHundredHandler extends Operations{
    public FiveHundredHandler(Operations next) {
        super(next);
    }

    @Override
    public void processTransaction(Integer amount) {
        if(amount>=500) {
            Integer notes=amount/500;
            Integer remainder=amount%500;
            System.out.println("Five hundred notes : "+notes);
            if(remainder!=0 && next!=null) {
                next.processTransaction(remainder);
            }
        }
        else {
            next.processTransaction(amount);
        }
    }
}
