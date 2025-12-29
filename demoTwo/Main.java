import java.util.*;
import java.util.HashMap;
public class Main {
    public static void main(String [] args) {
        Pair<Integer,Integer> p=new Pair<>();
        p.first=1;
        p.second=1;
        HashMap<Pair<Integer,Integer>,String> mpp=new HashMap<>();
        mpp.put(p,"Achuyth");
        System.out.println(mpp.containsKey(new Pair<>(1,1)));
    }
}