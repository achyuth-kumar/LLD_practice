import java.util.HashMap;
import java.util.Map;

public class TimeSheet {
   HashMap<Integer, Integer> efforts=new HashMap<Integer, Integer>();
    public void logEfforts(JiraItem jiraItem,int hours) {
        if((efforts.containsKey(jiraItem.getJiraID()) && hours<=efforts.get(jiraItem.getJiraID())) || hours<= jiraItem.getStoryPoints()) {
            efforts.put(jiraItem.getJiraID(), hours);
        }
        else {
            System.out.println("Cannot log efforts more than estimations");
        }
   }
   public void displayEfforts() {
        for(Map.Entry<Integer,Integer> entry : efforts.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
   }
}
