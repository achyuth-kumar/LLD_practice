import java.util.*;
public class Book {
    Integer slots=40;
    Vector<Integer> available=new Vector<>(slots,0);
    public Boolean getAvailability(Integer n) {
        if(!available.contains(n)) {
            available.addElement(n);
            return true;
        }
        return false;
    }
}