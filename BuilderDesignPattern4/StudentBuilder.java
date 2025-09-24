import java.util.List;

public class StudentBuilder {

    public String FirstName,LastName,Email;
    public List<String> subjects;
    public StudentBuilder(String firstName, String lastName, String email, List<String> subjects) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.subjects = subjects;
    }

    public StudentBuilder() {

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


    public Student build(Student student) {
        StudentBuilder builder=new StudentBuilder();
        builder.setFirstName(this.FirstName);
        builder.setLastName(this.LastName);
        builder.setEmail(this.Email);
        builder.setSubjects(this.subjects);
        return new Student(builder);
    }

}
