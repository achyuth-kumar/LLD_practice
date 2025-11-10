import Pair.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VersionControlServiceImpl implements VersionControl{
    HashMap<Integer,List<Pair<Integer, List<Integer>>>> cache;
    VersionControlServiceImpl() {
        cache=new HashMap<>();
    }
    @Override
    public void AddKey(Integer key, Integer value) {
        if(cache.containsKey(key)) {
            List<Pair<Integer, List<Integer>>> ExistingPairList=cache.get(key);
            Pair<Integer, List<Integer>> ExistingPair=ExistingPairList.getLast();
            Pair<Integer, List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=ExistingPair.first+1;
            List<Integer> ExistingList=ExistingPair.second;
            List<Integer> NewList=new ArrayList<>(ExistingList);
            NewList.add(value);
            NewPair.second=NewList;
            cache.get(key).add(NewPair);
        }
        else {
            List<Pair<Integer, List<Integer>>> NewPairList=new ArrayList<>();
            Pair<Integer, List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=0;
            List<Integer> NewList=new ArrayList<>();
            NewList.add(value);
            NewPair.second=NewList;
            NewPairList.add(NewPair);
            cache.put(key,NewPairList);
        }
    }

    @Override
    public Integer GetValue(Integer key, Integer snapID) {
        List<Pair<Integer, List<Integer>>> ExistingPairList=cache.get(key);
        for(Pair<Integer, List<Integer>> p : ExistingPairList) {
            if(p.first==snapID) {
                System.out.println(p.second);
                break;
            }
        }
        return 0;
    }
}
