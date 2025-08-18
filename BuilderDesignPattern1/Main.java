public class Main {
    public static void main(String [] args) {
        StudentBuilder studentBuilder=new MBAStudentBuilder();
        Director obj1=new Director(studentBuilder);
        Student student=obj1.createStudent(studentBuilder);
        System.out.println(studentBuilder.toString());
    }
}
