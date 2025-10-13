import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Book {
    public Integer id,Issue,Return;
    public String name;
    HashMap<Integer, List<Integer>> BookIssues=new HashMap<>();
    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
        for(int i=0;i<10;i++) {
            BookIssues.put(i,null);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssue() {
        return Issue;
    }

    public void setIssue(Integer issue) {
        Issue = issue;
    }

    public Integer getReturn() {
        return Return;
    }

    public void setReturn(Integer aReturn) {
        Return = aReturn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void BookIssue(Student student,Book book) {
        List<Integer> books=BookIssues.get(student.getId());
        if(books!=null) {
            books.add(book.getId());
        }
        else{
            books=new ArrayList<>();
            books.add(book.getId());
        }
        BookIssues.put(student.getId(), books);
    }
    public void ReturnBook(Student student,Book book) {
        List<Integer> books=BookIssues.get(student.getId());
        if(books!=null) {
            books.remove(book.getId());
            BookIssues.put(student.getId(), books);
        }
        else {
            BookIssues.put(student.getId(), null);
        }
    }




}
