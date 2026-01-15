public class Main {
    public static void main(String [] args) {
        Splitwise splitwise=new SplitWiseServiceImpl();
        Integer [][] transactions={{0,1,4},{1,2,5},{2,0,1}};
        System.out.println(splitwise.processPayment(transactions));
    }
}
