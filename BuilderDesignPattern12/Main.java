import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<String> subjects= List.of("CN","OS","DBMS");
        Student EngineeringStudent=new StudentBuilder().setFirstName("Achyuth").setSubjects(subjects).setEmail("achyuth@gmail.com").build();
        System.out.println(EngineeringStudent.getFirstName()+" , "+EngineeringStudent.getLastName()+" , "+EngineeringStudent.getEmail()+" , "+ EngineeringStudent.getSubjects()+" , "+EngineeringStudent.getEmail());

        subjects= List.of("Economics","Buisness Studies","Accountancy");
        Student MBAStudent=new StudentBuilder().setLastName("Raj").setSubjects(subjects).setEmail("ravi@gmail.com").build();
        System.out.println(MBAStudent.getFirstName()+" , "+MBAStudent.getLastName()+" , "+MBAStudent.getEmail()+" , "+ MBAStudent.getSubjects()+" , "+MBAStudent.getEmail());

    }
}
