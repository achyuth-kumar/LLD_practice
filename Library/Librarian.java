import java.util.HashMap;

public class Librarian {
    public Integer id;
    public String name;
    HashMap<Integer,Integer> StudentBooking=new HashMap<>();
    HashMap<Integer,Integer> BooksAvailability=new HashMap<>();
    public Librarian(Integer id, String name) {
        this.id = id;
        this.name = name;
        for(int i=0;i<10;i++) {
            BooksAvailability.put(i,null);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void IssueBook(Student student ,Book book){
        if(BooksAvailability.get(book.getId())!=null) {
            System.out.println(book.getName()+" is not available for "+ student.getName());
        }
        else {
            BooksAvailability.put(book.getId(),1);
            book.BookIssue(student,book);
            StudentBooking.put(student.getId(), book.getId());
            System.out.println(book.getName()+" has been booked to "+student.getName());
        }
    }
    public void ReturnBook(Student student,Book book) {
        if(BooksAvailability.get(book.getId())!=null && StudentBooking.get(student.getId())!=null) {
            BooksAvailability.put(book.getId(),null);
            book.ReturnBook(student,book);
            System.out.println(book.getName()+" have been returned by "+student.getName());
        }
        else {
            System.out.println(student.getName()+" didn't take the "+ book.getName()+" to return");
        }
    }
}
