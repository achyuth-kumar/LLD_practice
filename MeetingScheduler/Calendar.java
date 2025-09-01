import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Calendar {
    List<Date> dateList=new ArrayList<>();
    public List<Date> createCalendar() {
        int dateCount=0;
        for(int i=0;i<30;i++) {
            Date date=new Date(2001,1,dateCount++);
            dateList.add(date);
        }
        return dateList;
    }
}
