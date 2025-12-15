public class Main {
    public static void main(String [] args) {
        Student student=new Student(1,"Achyuth");
        Book book=new Book(1,"HC Verma");
        LibraryAdmin admin=new LibraryAdminServiceImpl();
        admin.IssueBook(student.getId(),book.getId(),1,8);
        admin.ReturnBook(student.getId(),book.getId());
        admin.Penalty(student.getId(), book.getId());
    }
}
