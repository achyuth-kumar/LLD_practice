import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects=new ArrayList<>();
        subjects.add("CN");
        subjects.add("OS");
        subjects.add("DBMS");
        Student EngineeringStudent=new StudentBuilder().setFirstName("").setSecondName("Kumar").setEmail("achyuth@gmail.com").setSubjects(subjects).build();
        System.out.println(EngineeringStudent.getFirstName()+" : "+EngineeringStudent.getSecondName()+" : "+ EngineeringStudent.email+" : "+EngineeringStudent.getSubjects());

        subjects.clear();
        subjects.add("Economics");
        subjects.add("Buisness Studies");
        subjects.add("Accountancy");
        Student MBAStudent=new StudentBuilder().setFirstName("Ravi").setSecondName("").setEmail("ravi@gmail.com").setSubjects(subjects).build();
        System.out.println(MBAStudent.getFirstName()+" : "+MBAStudent.getSecondName()+" : "+ MBAStudent.email+" : "+MBAStudent.getSubjects());


    }
}
