import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects=new ArrayList<>();
        subjects.add("CN");
        subjects.add("OS");
        subjects.add("DBMS");
        subjects.add("DSA");
        Student EngineeringStudent=new StudentBuilder().setFirstName("").setLastName("Kumar").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(EngineeringStudent.getFirstName()+" : "+EngineeringStudent.getLastName()+" : "+EngineeringStudent.getEmail()+" : "+EngineeringStudent.getSubjects());

        subjects=new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Accountancy");
        subjects.add("Buisness Study");
        Student MBAStudent=new StudentBuilder().setFirstName("Ravi").setLastName("").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(MBAStudent.getFirstName()+" : "+MBAStudent.getLastName()+" : "+MBAStudent.getEmail()+" : "+MBAStudent.getSubjects());

    }
}
