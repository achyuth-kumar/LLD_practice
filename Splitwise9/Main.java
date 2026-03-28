public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,4},{1,2,5},{0,2,2}};
        Splitwise splitwise=new SpltiwiseSreviceImpl(transactions);
        System.out.println("Result : "+splitwise.processTransactions());
    }
}
