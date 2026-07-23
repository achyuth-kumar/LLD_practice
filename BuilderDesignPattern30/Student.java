import java.util.List;

public class Student {
    Integer id;
    String firstName,lastName,email;
    List<String> subjects;


    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.email = studentBuilder.getEmail();
        this.subjects = studentBuilder.getSubjects();
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getId() {
        return id;
    }



}
