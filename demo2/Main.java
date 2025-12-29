import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Pair<Integer,Integer> p=new Pair<>(0,0);
        HashMap<Pair<Integer,Integer>,String> mpp=new HashMap<>();
        mpp.put(p,"Achyuth");
        System.out.println(mpp.containsKey(new Pair<>(0,0)));
        System.out.println(mpp.get(new Pair<>(0,0)));
    }
}
