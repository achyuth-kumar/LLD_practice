import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects=new ArrayList<>();
        subjects.add("CN");
        subjects.add("OS");
        subjects.add("DBMS");
        Student student= new StudentBuilder().setFirstName("Achyuth").setLastName("Kumar").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(student.getFirstName()+" : "+student.getLastName()+" : "+student.getEmail()+" : "+student.getSubjects());


    }

}
