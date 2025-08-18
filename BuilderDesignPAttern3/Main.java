public class Main {
    public static void main(String [] args) {
        StudentBuilder studentBuilder=new EngineeringStudentBuilder();
        Directory op1=new Directory(studentBuilder);
        op1.createStudent(studentBuilder);
        System.out.println(studentBuilder.toString());


        studentBuilder=new MBAStudentBuilder();
        op1=new Directory(studentBuilder);
        op1.createStudent(studentBuilder);
        System.out.println(studentBuilder.toString());
    }

}
