public class Main {
    public static void main(String [] args) {
        Student student1=new Student(1,"Achyuth");
        Book book=new Book(1,"H C Verma");
        Librarian librarian=new Librarian(1,"Kumar");
        librarian.IssueBook(student1,book);


        Student student2=new Student(2,"Ravi");
        librarian.IssueBook(student2,book);
        librarian.ReturnBook(student2,book);


        librarian.ReturnBook(student1,book);


        librarian.IssueBook(student2,book);

    }
}
