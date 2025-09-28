import java.util.List;

public class Student {
    public String firstName,secondName,email;
    public List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.getFirstName();
        this.secondName = studentBuilder.getSecondName();
        this.email = studentBuilder.getEmail();
        this.subjects = studentBuilder.getSubjects();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
