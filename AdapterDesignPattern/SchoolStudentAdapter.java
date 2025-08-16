public class SchoolStudentAdapter implements  Student{
    SchoolStudent schoolStudent;
    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent=schoolStudent;
    }

    @Override
    public void details() {
        this.schoolStudent.details();
    }
}
