import java.util.List;

public class Student {

    public String FirstName,LastName,Email;
    public List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.FirstName = studentBuilder.getFirstName();
        this.LastName = studentBuilder.getLastName();
        this.Email = studentBuilder.getEmail();
        this.subjects = studentBuilder.getSubjects();
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

}
