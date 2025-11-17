import java.util.List;

public class Main {
    public static void main(String [] args) {
        StudentBuilder studentBuilder=new StudentBuilder();

        Student engineeringStudent=studentBuilder.setId(1).setFirstName("Achyuth").setLastName("Kumar").setEmail("achyth@gmail.com").setSubjects(List.of("CN","OS","DBMS")).build();
        System.out.println(engineeringStudent.getFirstName()+" : "+engineeringStudent.getLastName()+" : "+engineeringStudent.getEmail()+" : "+engineeringStudent.getSubjects());

        Student mbaStudent=studentBuilder.setId(2).setFirstName("Ravi").setLastName("Raj").setEmail("ravi@gmail.com").setSubjects(List.of("Buisness study","accountancy","economics")).build();
        System.out.println(mbaStudent.getFirstName()+" : "+mbaStudent.getLastName()+" : "+mbaStudent.getEmail()+" : "+mbaStudent.getSubjects());

    }
}
