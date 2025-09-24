import java.util.List;

public class Student {
    StudentBuilder studentBuilder;
    Student(StudentBuilder studentBuilder) {
        this.studentBuilder=studentBuilder;
    }

    public String FirstName,LastName,Email;
    public List<String> subjects;

    public String getFirstName() {
        return this.getStudentBuilder().FirstName;
    }

    public StudentBuilder getStudentBuilder() {
        return this.studentBuilder;
    }

    public String getLastName() {
        return this.getStudentBuilder().LastName;
    }

    public String getEmail() {
        return this.getStudentBuilder().Email;
    }

    public List<String> getSubjects() {
        return this.getStudentBuilder().subjects;
    }


    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setStudentBuilder(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }


}
