import java.util.List;

public class Student {
    public String firstName;
    public String lastName;
    public String email;
    public List<String> Subjects;


    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.email = studentBuilder.getEmail();
        this.Subjects = studentBuilder.getSubjects();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.Subjects = subjects;
    }


}
