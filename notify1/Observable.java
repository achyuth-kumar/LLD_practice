import java.util.*;
public class Observable implements Observer {
    HashSet<Integer> st=new HashSet<>(); 
    @Override 
    public void add(int n) {
        st.add(n);
        System.out.println("Item "+n+" added into cart");
    } 
    @Override
    public void remove(int n) {
        st.remove(n);
        System.out.println("Item "+n+" removed from cart");
    }
    @Override
    public void display() {
        System.out.println("Cart items : ");
        for(Integer i : st) {
            System.out.println(i);
        }
    }
}