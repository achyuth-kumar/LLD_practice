import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects=List.of("CN","OS","DBMS");
        Student engStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("").setEmail("achyuth@email.com").setSubjects(subjects).build();
        System.out.println(engStudent.getId()+" , "+ engStudent.getFirstName()+" , "+engStudent.getLastName()+" , "+engStudent.getEmail()+" , "+engStudent.getSubjects());

        subjects=List.of("Economics","Buisness Studies","Accountancy");
        Student mbaStudent=new StudentBuilder().setId(2).setFirstName("").setLastName("Raj").setEmail("ravi@email.com").setSubjects(subjects).build();
        System.out.println(mbaStudent.getId()+" , "+ mbaStudent.getFirstName()+" , "+mbaStudent.getLastName()+" , "+mbaStudent.getEmail()+" , "+mbaStudent.getSubjects());

    }
}
