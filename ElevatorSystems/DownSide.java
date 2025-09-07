import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DownSide {
    public HashSet<Integer> person=new HashSet<>();
    public HashMap<Integer, Integer> downSideSteps=new HashMap<Integer, Integer>();
    public void StepIn(int stepPosition,int id) {
        if(downSideSteps.containsKey(stepPosition) && person.contains(id)){
            System.out.println(id+" : Duplicate person, enter some other person id");
            return ;
        }
        else if(!downSideSteps.containsKey(stepPosition)) {
            person=new HashSet<>();
        }
        if(downSideSteps.containsKey(stepPosition) && downSideSteps.get(stepPosition)>=2){
            System.out.println("Mr : "+id+" : Please step into some other steps");
            return ;
        }
        person.add(id);
        downSideSteps.put(stepPosition, downSideSteps.getOrDefault(stepPosition, 0) + 1);
    }
    public void StepOut(int stepPosition) {
        downSideSteps.put(stepPosition,0);
        System.out.println("people at step : "+stepPosition+" stepped out");
    }
    public void displaySteps() {
        for(Map.Entry<Integer,Integer> entry : downSideSteps.entrySet()) {
            System.out.println("Step position : "+entry.getKey()+" , people count : "+entry.getValue());
        }
    }


}
