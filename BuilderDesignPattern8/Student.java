import java.util.List;

public class Student {

    public String firstName,lastName,Email;
    public List<String> Subjects;

    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.Email = studentBuilder.getEmail();
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }


}
