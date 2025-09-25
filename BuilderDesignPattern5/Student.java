import java.util.List;

public class Student {

    public String firstName,lastName,email;
    public List<String> subjects;
    public Student(StudentBuilder studentBuilder) {
        this.firstName=studentBuilder.firstName;
        this.lastName=studentBuilder.lastName;
        this.email=studentBuilder.email;
        this.subjects=studentBuilder.subjects;
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
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }





}
