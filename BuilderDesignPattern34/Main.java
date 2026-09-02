import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subjects= List.of("DSA","LLD","HLD");
        Student engStudent=new StudentBuilder().setId(1).setFirstName("Achyuth").setLastName("Kumar").setEmail("achuyuth@email.com").setSubjects(subjects).build();
        System.out.println(engStudent.getId()+" , "+ engStudent.getFirstName()+" , "+engStudent.getLastName()+" , "+engStudent.getEmail()+" , "+engStudent.getSubjects());
    }
}
