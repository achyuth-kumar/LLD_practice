import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subjects= List.of("CN","OS","DBMS");
        Student engStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("Kumar").setSubjects(subjects).setEmail("achyuth@gmail.com").build();
        System.out.println(engStudent.getId()+" , "+ engStudent.getFirstName()+" , "+engStudent.getLastName()+" , "+engStudent.getEmail()+" , "+engStudent.getSubjects());

        subjects= List.of("Accountancy","Economics","Buisness Studies");
        Student mbaStudent=new StudentBuilder().setId(2).setFirstName("Ravi").setLastName("Raj").setSubjects(subjects).setEmail("ravi@gmail.com").build();
        System.out.println(mbaStudent.getId()+" , "+ mbaStudent.getFirstName()+" , "+mbaStudent.getLastName()+" , "+mbaStudent.getEmail()+" , "+mbaStudent.getSubjects());

    }
}
