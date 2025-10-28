import java.util.List;

public class StudentBuilder {
    public String FirstName,LastName,Email;
    public List<String> Subjects;

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

