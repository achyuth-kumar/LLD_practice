import java.util.List;

public class Student {
    Integer id;
    String firstName;
    String lastName;
    String email;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.email = studentBuilder.getEmail();
        this.subjects = studentBuilder.getSubjects();
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

}
