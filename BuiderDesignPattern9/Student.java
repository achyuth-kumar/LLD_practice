import java.util.List;

public class Student {
    public String FirstName,LastName,Email;
    public List<String> Subjects;

    public Student(StudentBuilder studentBuilder) {
        FirstName = studentBuilder.getFirstName();
        LastName = studentBuilder.getLastName();
        Email = studentBuilder.getEmail();
        Subjects = studentBuilder.getSubjects();
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
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }


}
