import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects=new ArrayList<>();
        subjects.add("CN");
        subjects.add("OS");
        subjects.add("DBMS");
        Student EngineeringStudent=new StudentBuilder().setFirstName("Achyuth").setLastName("Kumar").setEmail("Achyuth@gmal.com").setSubjects(subjects).build();
        System.out.println(EngineeringStudent.getFirstName()+" : "+EngineeringStudent.getLastName()+" : "+EngineeringStudent.getEmail()+" : "+EngineeringStudent.getSubjects());

        subjects=new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Buisness Studies");
        subjects.add("Accountancy");
        Student MBAStudent=new StudentBuilder().setFirstName("Ravi").setLastName("Raj").setEmail("Raj@gmal.com").setSubjects(subjects).build();
        System.out.println(MBAStudent.getFirstName()+" : "+MBAStudent.getLastName()+" : "+MBAStudent.getEmail()+" : "+MBAStudent.getSubjects());

    }
}
