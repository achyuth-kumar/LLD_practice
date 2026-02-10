import java.util.List;

public class Student {

    public Integer id;
    public String firstName,lastName, email;
    public List<String> subjects;
    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.email = studentBuilder.getEmail();
        this.subjects = studentBuilder.getSubjects();
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

    public String getEmail() {
        return email;
    }

    public List<String> getSubjects() {
        return subjects;
    }


}
