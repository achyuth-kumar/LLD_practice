import Pair.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VersionControlImpl implements VersionControl{
    HashMap<Integer,List<Pair<Integer, List<Integer>>>> cache=new HashMap<>();
    @Override
    public void put(Integer Key, Integer Value) {
        if(cache.containsKey(Key)) {
            List<Pair<Integer, List<Integer>>> ExistingData=cache.get(Key);
            Pair<Integer, List<Integer>> ExistingPair=ExistingData.getLast();
            Pair<Integer, List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=ExistingPair.first+1;
            List<Integer> list=new ArrayList<>(ExistingPair.second);
            list.add(Value);
            NewPair.second=list;
            cache.get(Key).add(NewPair);
        }
        else {
            List<Pair<Integer, List<Integer>>> NewPairList=new ArrayList<>();
            Pair<Integer,List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=0;
            List<Integer> list= new ArrayList<>();
            list.add(Value);
            NewPair.second=list;
            NewPairList.add(NewPair);
            cache.put(Key,NewPairList);
        }
    }

    @Override
    public void get(Integer Key, Integer Version) {
        List<Pair<Integer, List<Integer>>> ExistingData=cache.get(Key);
        for(int i=0;i<ExistingData.size();i++) {
            Pair<Integer, List<Integer>>p=ExistingData.get(i);
            if(p.first.equals(Version)) {
                System.out.println("result : "+p.second);
                break;
            }
        }
    }
}
