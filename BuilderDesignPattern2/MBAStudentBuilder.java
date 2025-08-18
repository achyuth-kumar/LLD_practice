import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Buisness_Studies");
        subjects.add("Accountancy");
        this.subjects=subjects;
        return this;
    }
}
