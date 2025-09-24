import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> EngSubjects=new ArrayList<>(List.of(new String[]{"CN", "OS", "DBMS"}));
        StudentBuilder EngStudentbuilder=new StudentBuilder("", "Kumar", "achyuth@gmail.com", EngSubjects);
        Student student=new Student(EngStudentbuilder);
        Student student2=EngStudentbuilder.build(student);
        System.out.print(student2.getFirstName()+" : "+student2.getLastName()+" : "+student2.getEmail()+" : "+student2.getSubjects());
        System.out.println();

        List<String> MBAsubjects=new ArrayList<>(List.of(new String[]{"Accountancy", "Stocks", "Economics"}));
        StudentBuilder MBAStudentbuilder=new StudentBuilder("Ravi", "", "ravi@gmail.com", MBAsubjects);
        student=new Student(MBAStudentbuilder);
        student2=MBAStudentbuilder.build(student);
        System.out.print(student2.getFirstName()+" : "+student2.getLastName()+" : "+student2.getEmail()+" : "+student2.getSubjects());
        System.out.println();
    }
}
