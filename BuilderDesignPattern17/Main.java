import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subjects=List.of("CN","OS","DBMS");
        Student engineeringStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("Kumar").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(engineeringStudent.getId()+" , "+ engineeringStudent.getFirstName()+" , "+engineeringStudent.getLastName()+" , "+engineeringStudent.getSubjects()+" , "+engineeringStudent.getEmail());
        subjects=List.of("Economics","Accountancy","Buisness Studies");
        Student mbaStudent=new StudentBuilder().setId(2).setFirstName("Ravi").setLastName("Raj").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(mbaStudent.getId()+" , "+ mbaStudent.getFirstName()+" , "+mbaStudent.getLastName()+" , "+mbaStudent.getSubjects()+" , "+mbaStudent.getEmail());

    }
}
