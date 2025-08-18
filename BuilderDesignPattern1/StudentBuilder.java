import java.util.List;

public abstract class StudentBuilder {
    public int id;
    public String name;
    public String rollNumber;
    public List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }
    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
    public String toString() {
        return this.id+" : "+this.name+" : "+this.rollNumber+" : "+this.subjects;
    }



}
