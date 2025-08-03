public class SchoolStudentAdapter implements Student {
    public SchoolStudent schoolStudent;
    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent=schoolStudent;
    }
    @Override
    public void getFirstName() {
        this.schoolStudent.getFirstName();
    }
    @Override
    public void getLastName() {
        this.schoolStudent.getLastName();
    }
    @Override
    public void getEmail() {
        this.schoolStudent.getEmail();
    }
    
}