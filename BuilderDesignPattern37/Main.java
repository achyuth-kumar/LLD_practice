import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subjects=List.of("CN","OS","DBMS");
        Student engStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("Kumar").setEmail("achyuth@email.com").setSubjects(subjects).build();
        System.out.println(engStudent.getId()+" , "+engStudent.getFirstName()+" , "+engStudent.getLastName()+" , "+engStudent.getEmail()+" , "+engStudent.getSubjects());

        subjects=List.of("Economics","Accountancy","Buisness Studies");
        Student MBAStudent=new StudentBuilder().setId(2).setFirstName("Ravi").setLastName("Raj").setEmail("ravi@email.com").setSubjects(subjects).build();
        System.out.println(MBAStudent.getId()+" , "+MBAStudent.getFirstName()+" , "+MBAStudent.getLastName()+" , "+MBAStudent.getEmail()+" , "+MBAStudent.getSubjects());


    }
}
