import java.util.List;

public class StudentBuilder {
    public String firstName,secondName,email;
    public List<String> subjects;

    public String getFirstName() {
        return firstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public StudentBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }
    public Student build() {
        return new Student(this);
    }

}
