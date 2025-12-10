import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects= List.of("CN","OS","DBMS");
        Student engineeringStudent=new StudentBuilder().setFirstName("Achyuth").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(engineeringStudent.getFirstName()+" : "+engineeringStudent.getLastName()+" : "+engineeringStudent.getEmail()+" : "+engineeringStudent.getSubjects());
        subjects=List.of("Economics","Buisness Studies","Accountancy");
        Student mbaStudent=new StudentBuilder().setLastName("Raj").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(mbaStudent.getFirstName()+" : "+mbaStudent.getLastName()+" : "+mbaStudent.getEmail()+" : "+mbaStudent.getSubjects());

    }
}
