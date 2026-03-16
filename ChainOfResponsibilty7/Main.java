public class Main {
    public static void main(String [] args) {
        Operations operations;
        Operations h100=new HundredHandler(null);
        Operations h500=new FiveHundredHandler(h100);
        Operations h2000=new TwoThousandHandler(h500);
        operations=h2000;
        operations.processTransactions(3700);
    }
}
