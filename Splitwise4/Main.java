public class Main {
    public static void main(String[] args) {
        Integer [][]transactions={{0,1,5},{1,2,4},{2,0,1}};
        SplitWise splitWise=new SplitWiseServiceImpl();
        System.out.println(splitWise.processTransaction(transactions));
    }
}
