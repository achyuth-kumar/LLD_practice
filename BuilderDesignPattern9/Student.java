import java.util.List;

public class Student {
    public String FirstName,LastName,Email;
    public List<String> Subjects;

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public Student(StudentBuilder studentBuilder) {
        FirstName = studentBuilder.getFirstName();
        LastName = studentBuilder.getLastName();
        Email = studentBuilder.getEmail();
        Subjects = studentBuilder.getSubjects();
    }


}
