import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects= List.of("CN","OS","DBMS");
        Student engineeringStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("Kumar").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(engineeringStudent.getId()+" , "+engineeringStudent.getFirstName()+" , "+engineeringStudent.getLastName()+" , "+engineeringStudent.getEmail()+" , "+engineeringStudent.getSubjects());

        subjects= List.of("Accountancy","Buisness studies","Economics");
        Student mbaStudent=new StudentBuilder().setId(2).setFirstName("Ravi").setLastName("Raj").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(mbaStudent.getId()+" , "+mbaStudent.getFirstName()+" , "+mbaStudent.getLastName()+" , "+mbaStudent.getEmail()+" , "+mbaStudent.getSubjects());

    }
}
