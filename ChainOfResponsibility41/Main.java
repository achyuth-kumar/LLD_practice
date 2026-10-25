public class Main {
    public static void main(String[] args) {
         Operations operations;
         HundredHandler h100=new HundredHandler(null);
         FiveHundredHandler h500=new FiveHundredHandler(h100);
         TwoThousandHandler h2000=new TwoThousandHandler(h500);
         operations=h2000;
         operations.processTransactions(3700);
    }
}
