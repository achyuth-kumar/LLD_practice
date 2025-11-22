import java.util.List;

public class Main {
    public static void main(String [] args) {
        Integer [][] transactions={{0,1,5},{1,2,5},{2,0,10},{0,2,1}};
        SplitWise splitWise=new SplitWise();
        System.out.println("Result : "+splitWise.Simplify(transactions));
    }
}
