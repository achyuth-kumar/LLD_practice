import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("ecnomics");
        subjects.add("buisness");
        subjects.add("accountancy");
        this.subjects=subjects;
        return this;
    }
}
