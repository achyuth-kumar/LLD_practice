import java.util.List;

public class StudentBuilder {
    public String FirstName,LastName,Email;
    public List<String> subjects;

    public String getFirstName() {
        return FirstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.FirstName = firstName;
        return this;
    }

    public String getLastName() {
        return LastName;
    }

    public StudentBuilder setLastName(String lastName) {
        this.LastName = lastName;
        return this;
    }

    public String getEmail() {
        return Email;
    }

    public StudentBuilder setEmail(String email) {
        this.Email = email;
        return this;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }
    public Student  build() {
        return new Student(this);
    }

}
