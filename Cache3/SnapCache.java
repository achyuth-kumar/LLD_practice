import java.util.*;

public class SnapCache{
    HashMap<Integer,List<Pair<Integer,List<Integer>>>> cache=new HashMap<>();
    Integer count=0;
    public void SetValue(Integer Key,Integer Value) {
        if(cache.containsKey(Key)) {
            this.count+=1;
            List<Pair<Integer,List<Integer>>> list=cache.get(Key);
            HashSet<Integer> ExistingSet=new HashSet<>();
            for(Pair<Integer,List<Integer>> p : list) {
                ExistingSet.addAll(p.second);
            }
            Pair<Integer,List<Integer>>p=new Pair<>();
            ExistingSet.add(Value);
            List<Integer> ExistingList = new ArrayList<>(ExistingSet);
            p.first= Collections.singletonList(this.count);
            p.second= ExistingList;
            list.add(p);
            cache.put(Key, list);
        }
        else {
            this.count=0;
            List<Pair<Integer,List<Integer>>> list=new ArrayList<>();
            List<Integer> ValueList=new ArrayList<>();
            ValueList.add(Value);
            Pair<Integer,List<Integer>>p=new Pair<>();
            p.first= Collections.singletonList(this.count);
            p.second=ValueList;
            list.add(p);
            cache.put(Key, list);
        }
    }

    public void GetValue(Integer key,Integer SnapId) {
        List<Pair<Integer,List<Integer>>> list=cache.get(key);
        List<Integer> result=new ArrayList<>();
        if(list!=null) {
            for (Pair<Integer, List<Integer>> p : list) {
                if(p.first.contains(SnapId)) {
                    result=p.second;
                    break;
                }
            }
        }
        System.out.println("result : "+result);
    }
}
