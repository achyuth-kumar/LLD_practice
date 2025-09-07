import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UpSide {
    public HashSet<Integer> person=new HashSet<>();
    public HashMap<Integer, Integer> upSideSteps=new HashMap<Integer, Integer>();
    public void StepIn(int stepPosition,int id) {
        if(upSideSteps.containsKey(stepPosition) && person.contains(id)){
            System.out.println(id+" : Duplicate person, enter some other person id");
            return ;
        }
        else if(!upSideSteps.containsKey(stepPosition)) {
            person=new HashSet<>();
        }
        if(upSideSteps.containsKey(stepPosition) && upSideSteps.get(stepPosition)>=2){
            System.out.println("Mr : "+id+" : Please step into some other steps");
            return ;
        }
        person.add(id);
        upSideSteps.put(stepPosition, upSideSteps.getOrDefault(stepPosition, 0) + 1);
    }
    public void StepOut(int stepPosition) {
        upSideSteps.put(stepPosition,0);
        System.out.println("people at step : "+stepPosition+" stepped out");
    }
    public void displaySteps() {
        for(Map.Entry<Integer,Integer> entry : upSideSteps.entrySet()) {
            System.out.println("Step position : "+entry.getKey()+" , people count : "+entry.getValue());
        }
    }


}
