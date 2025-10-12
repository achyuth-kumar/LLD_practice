import java.util.List;

public class StudentBuilder {
    public String firstName,lastName,Email;
    public List<String> Subjects;

    public String getFirstName() {
        return firstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
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
        return Subjects;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.Subjects = subjects;
        return this;
    }
    public Student build() {
        return new Student(this);
    }

}
