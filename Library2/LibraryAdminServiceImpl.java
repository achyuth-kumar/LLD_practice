import Pair.Pair;

import java.awt.print.Book;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LibraryAdminServiceImpl implements LibraryAdmin{
    HashMap<Integer, List<Integer>> StudentBooking;
    HashMap<Integer, Pair<Integer,Integer>> StudyMaterialBooking;
    public LibraryAdminServiceImpl() {
        this.StudentBooking = new HashMap<>();
        this.StudyMaterialBooking = new HashMap<>();
    }
    @Override
    public void IssueBook(Integer StudentId, Integer BookId,Integer StartTime,Integer EndTime) {
        List<Integer> books=StudentBooking.get(StudentId);
        if(books!=null && books.contains(BookId)) {
            System.out.println("Student : "+StudentId+" is already having this : "+ BookId+" Bookd");
            return ;
        }
        Pair<Integer,Integer> availability = StudyMaterialBooking.get(BookId);
        if(availability!=null && availability.first!=null && availability.second!=null) {
            if(StartTime<availability.first || EndTime>availability.second) {
                System.out.println("Book : " + BookId + " is not available");
                return;
            }
        }
        if(books!=null) {
            books.add(BookId);
            StudentBooking.put(StudentId, books);
        }
        StudyMaterialBooking.put(BookId, new Pair<Integer, Integer>(StartTime, EndTime));
        System.out.println("Book : "+BookId+" have been issued for student : "+StudentId);
    }

    @Override
    public void ReturnBook(Integer StudentId, Integer BookId) {
        List<Integer> books=StudentBooking.get(StudentId);
        if(books!=null && !books.contains(BookId)) {
            System.out.println("Book is missing : "+BookId);
            return ;
        }
        StudentBooking.remove(BookId);
        System.out.println("Book : "+BookId+" : Returned by : "+StudentId);
    }

    @Override
    public void Penalty(Integer StudentId, Integer BookId) {
        List<Integer> books=StudentBooking.get(StudentId);
        if(books!=null && !books.contains(BookId)) {
            System.out.println("Book "+BookId+" not found under student "+StudentId);
            return ;
        }
        Pair<Integer,Integer> Duration=StudyMaterialBooking.get(BookId);
        if((Duration.second-Duration.first)>10) {
            System.out.println("Fine amount : "+(Duration.second-Duration.first)*5);
        }
        else {
            System.out.println("No Fine");
        }
    }
}
