public class Director {
    public Student createStudent(StudentBuilder studentBuilder) {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent(studentBuilder);
        }
        else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent(studentBuilder);
        }
        return null;
    }

    public Student createEngineeringStudent(StudentBuilder studentBuilder) {
        return studentBuilder.setId(1).setName("Achyuth").setRollNumber(100).setSubjects().build();
    }

    public Student createMBAStudent(StudentBuilder studentBuilder) {
        return studentBuilder.setId(2).setName("Kumar").setRollNumber(200).setSubjects().build();
    }
}
