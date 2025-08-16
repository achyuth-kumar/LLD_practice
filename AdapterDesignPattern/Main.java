public class Main {
    public static void main(String [] args) {
        Student collegeStudent=new CollegeStudent();
        collegeStudent.details();
        Student schoolStudentAdapter=new SchoolStudentAdapter(new SchoolStudent());
        schoolStudentAdapter.details();
    }
}
