public class Main {
    public static void main(String [] args) {
        StudentBuilder studentBuilder=new EngineeringStudentBuilder();
        Director op1=new Director();
        Student student=op1.createStudent(studentBuilder);
        System.out.println(studentBuilder.toString());
    }
}
