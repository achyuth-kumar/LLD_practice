public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder) {
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent(StudentBuilder studentBuilder) {
        if(studentBuilder instanceof EngeeringStudentBuilder) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder)  {
            return createMBAStudent();
        }
        return null;
    }
    public Student createEngineeringStudent() {
        return studentBuilder.setId(1).setName("Achyuth").setRollNumber("100").setSubjects().build();
    }
    public Student createMBAStudent() {
        return studentBuilder.setId(2).setName("Kumar").setRollNumber("200").setSubjects().build();
    }
}
