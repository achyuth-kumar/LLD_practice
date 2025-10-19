import java.util.*;

public class SnapCache{
    HashMap<Integer,List<List<Integer>>> cache=new HashMap<>();
    public void put(Integer SnapId,Integer value) {
        List<Pair<Integer,List<Integer>>> previous=new ArrayList<>();
        if(cache.containsKey(key)) {
            previous=cache.get(key);
            List<Integer>prev_list=new ArrayList<>();
            for(Pair<Integer, List<Integer>> p : previous) {
                prev_list=p.second;
            }
            prev_list.add(value);
            Pair<Integer,List<Integer>>p=new Pair<>();
            p.first= Collections.singletonList(SnapId);
            p.second=prev_list;
            previous.add(p);
            cache.put(key, previous);
        }
        else {
            Pair<Integer,List<Integer>>p=new Pair<>();
            p.first=Collections.singletonList(SnapId);
            List<Integer> list=new ArrayList<>();
            list.add(value);
            p.second=list;
            previous.add(p);
            cache.put(key, previous);
        }
    }

    public void get(Integer key,Integer SnapId) {
        List<Pair<Integer,List<Integer>>> child=cache.get(key);
        List<Integer> result=new ArrayList<>();
        if(child!=null && child.get(SnapId)!=null) {
            for (Pair<Integer,List<Integer>> p : child) {
                if(p.first.equals(SnapId)) {
                    result=p.second;
                    break;
                }
            }
        }
        for(Integer e : result ){
            System.out.println(e+" ");
        }
        System.out.println();
    }
}
