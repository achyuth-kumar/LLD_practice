import java.util.List;

public class Student {
    Integer id;
    String firstName;
    String lastName;
    String email;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.subjects = subjects;
    }
    public List<String> getSubjects() {
        return subjects;
    }


    public String getEmail() {
        return email;
    }



    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public Integer getId() {
        return id;
    }


}
