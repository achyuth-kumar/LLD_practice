import java.util.List;

public abstract class StudentBuilder {
    public int id;
    public int rollNumber;
    public String name;
    public List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
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
