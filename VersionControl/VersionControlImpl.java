import Pair.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VersionControlImpl implements VersionControl{
    HashMap<Integer,List<Pair<Integer, List<Integer>>>> cache=new HashMap<>();
    @Override
    public void put(Integer key, Integer Value) {
        if(cache.containsKey(key)) {
            List<Pair<Integer, List<Integer>>> existing=cache.get(key);
            Pair<Integer, List<Integer>> existing_pair = existing.getLast();
            Pair<Integer, List<Integer>> NewPair = new Pair<Integer, List<Integer>>();

            NewPair.first = existing_pair.first+1;
            List<Integer> list=new ArrayList<>(existing_pair.second);
            list.add(Value);
            NewPair.second = list;
            cache.get(key).add(NewPair);
        }
        else {
            List<Pair<Integer, List<Integer>>> NewPairList=new ArrayList<>();
            Pair<Integer, List<Integer>> p=new Pair<Integer, List<Integer>>();
            List<Integer> list=new ArrayList<>();
            list.add(Value);
            p.first=0;
            p.second=list;
            NewPairList.add(p);
            cache.put(key,NewPairList);
        }
    }

    @Override
    public void getValueAtVersion(Integer key, Integer version) {
        if(cache.containsKey(key)) {
            List<Pair<Integer, List<Integer>>> existing = cache.get(key);
            for(int i=0;i<existing.size();i++) {
                Pair<Integer, List<Integer>> p =existing.get(i);
                if(p.first.equals(version)) {
                    System.out.println("result : "+p.second);
                    break;
                }
            }
        }
        else {
            System.out.println("Key not found in cache");
        }
    }
}
