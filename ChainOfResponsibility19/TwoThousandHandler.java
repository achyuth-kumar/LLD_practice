import javax.annotation.processing.SupportedSourceVersion;

public class TwoThousandHandler extends Operations{
    public TwoThousandHandler(Operations next) {
        super(next);
    }

    @Override
    public void processTransaction(Integer amount) {
        if(amount>=2000) {
            Integer notes=amount/2000;
            Integer remainder=amount%2000;
            System.out.println("Two thousand notes : "+notes);
            if(remainder!=0 && next!=null) {
                next.processTransaction(remainder);
            }
        }
        else {
            next.processTransaction(amount);
        }
    }
}
