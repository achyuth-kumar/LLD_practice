import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        List<String> subjects=List.of("CN","OS","DBMS");
        Student engStudent=new StudentBuilder().setFirstName("Achyuth").setLastName("").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(engStudent.getFirstName()+" , "+engStudent.getLastName()+" , "+engStudent.getEmail()+" , "+engStudent.getSubjects());
        subjects=List.of("Economiccs","Accountancy","Buisness Studies");
        Student mbaStudent=new StudentBuilder().setFirstName("").setLastName("Raj").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(mbaStudent.getFirstName()+" , "+mbaStudent.getLastName()+" , "+mbaStudent.getEmail()+" , "+mbaStudent.getSubjects());

    }
}
