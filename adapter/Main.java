import java.util.*;
public class Main {
    public static void main(String args[]) {
        List<Student> students=new ArrayList<>();
        CollegeStudent collegeStudent=new CollegeStudent();
        SchoolStudent schoolStudent=new SchoolStudent();
        students.add(collegeStudent);
        System.out.println(students);
        students.add(new SchoolStudentAdapter(schoolStudent));
        System.out.println(students);
    }
}