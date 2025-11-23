import Pair.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GitServiceImpl implements Git{
    HashMap<Integer,List<Pair<Integer,List<String>>>> mpp;
    int count;
    GitServiceImpl() {
        mpp=new HashMap<>();
        this.count=0;
    }

    @Override
    public void PutKey(int id, String input) {
        if(mpp.containsKey(id)) {
            List<Pair<Integer,List<String>>>  ExistingListPairs=mpp.get(id);
            Pair<Integer,List<String>> ExistingPair=ExistingListPairs.getLast();
            List<String> ExistingList=ExistingPair.second;
            List<String> NewList=new ArrayList<>(ExistingList);
            this.count+=1;
            NewList.add(input);
            Pair<Integer,List<String>> NewPair=new Pair<Integer, List<String>>();
            NewPair.first=this.count;
            NewPair.second=NewList;
            ExistingListPairs.add(NewPair);
            mpp.put(id,ExistingListPairs);
        }
        else {
            List<Pair<Integer,List<String>>>  NewListPairs=new ArrayList<>();
            Pair<Integer,List<String>> NewPair=new Pair<Integer, List<String>>();
            List<String> NewList=new ArrayList<>();
            NewList.add(input);
            this.count=0;
            NewPair.first=this.count;
            NewPair.second=NewList;
            NewListPairs.add(NewPair);
            mpp.put(id,NewListPairs);
        }
    }

    @Override
    public void GetValue(int id,int versionNo) {
        List<Pair<Integer,List<String>>>  ExistingListPairs=mpp.get(id);
        for(Pair<Integer,List<String>> e : ExistingListPairs) {
            if(e.first==versionNo) {
                System.out.println("fruits : " + e.second);
            }
        }
    }

    @Override
    public void DisplayValues() {
        for(Map.Entry<Integer,List<Pair<Integer,List<String>>>> entry : mpp.entrySet()) {
            System.out.println("Key : "+entry.getKey());
            for(Pair<Integer,List<String>> e : entry.getValue() ) {
                System.out.println("Version no : "+e.first);
                System.out.println("Fruits : "+e.second);
            }
        }
    }
}
