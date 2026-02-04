public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,2},{1,2,3},{0,2,1}};
        SplitWise splitWise=new SplitWiseServiceImpl(transactions);
        System.out.println("Result : "+splitWise.processTransactions());
    }
}

