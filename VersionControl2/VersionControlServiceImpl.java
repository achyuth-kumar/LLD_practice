import Pair.Pair;
import com.sun.jdi.IntegerType;

import java.util.*;

public class VersionControlServiceImpl implements VersionControl{
    HashMap< Integer, List<Pair<Integer,List<Integer>>> > cache;
    Integer count;
    VersionControlServiceImpl() {
        this.cache=new HashMap<>();
        this.count=0;
    }
    @Override
    public void AddKey(int key, int value) {
        if (cache.containsKey(key)) {
            List<Pair<Integer, List<Integer>>> existingPairList = cache.get(key);
            Pair<Integer, List<Integer>> ExistingPair=existingPairList.getLast();

            Pair<Integer, List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=ExistingPair.first+1;


            // Make sure second is initialized
            List<Integer> newList = new ArrayList<>(ExistingPair.second);
            newList.add(value);
            NewPair.second=newList;
            cache.get(key).add(NewPair);
        } else {
            // If key doesn't exist, initialize the list properly
            List<Pair<Integer, List<Integer>>> NewPairList = new ArrayList<>();
            Pair<Integer, List<Integer>> NewPair=new Pair<Integer, List<Integer>>();
            NewPair.first=0;

            // Initialize the second field as a new ArrayList
            List<Integer> newList = new ArrayList<>();
            newList.add(value);
            NewPair.second=newList;
            NewPairList.add(NewPair);
            cache.put(key, NewPairList);
        }
    }


    @Override
    public int GetValue(int key,int snapId) {
        List<Pair<Integer,List<Integer>>> ExistingPairList=cache.get(key);
        for (Pair<Integer,List<Integer>> p : ExistingPairList) {
            if(p.first==snapId) {
                System.out.print(p.second + " ");
                break;
            }
        }
        System.out.println();
        return -1;
    }

}
