import java.util.*;

public class VersionControlServiceImpl implements VersionControl{

    HashMap<Integer,HashMap<Integer, List<String>>> cache;
    Integer version;
    public VersionControlServiceImpl() {
        this.cache = new HashMap<>();
        this.version=0;
    }

    @Override
    public void put(Integer key, String value) {
        if(cache.containsKey(key)) {
            HashMap<Integer, List<String>> ExistingMap=cache.get(key);
            List<String> ExistingList=ExistingMap.get(this.version-1);
            List<String> NewList = new ArrayList<>(ExistingList);
            NewList.add(value);
            ExistingMap.put(this.version,NewList);
            cache.put(key,ExistingMap);
        }
        else {
            this.version=0;
            HashMap<Integer, List<String>> newMap=new HashMap<>();
            List<String> newList=new ArrayList<>();
            newList.add(value);
            newMap.put(version,newList);
            cache.put(key,newMap);
        }
        this.version++;
    }

    @Override
    public void get(Integer key,Integer version) {
        HashMap<Integer, List<String>> ExistingMap=cache.get(key);
        for(Map.Entry<Integer,List<String>> entry : ExistingMap.entrySet()) {
            if(Objects.equals(version, entry.getKey())) {
            System.out.println("Value "+entry.getValue());
            }
        }
    }

    @Override
    public void view() {
        for(Map.Entry<Integer,HashMap<Integer,List<String>>> entry : cache.entrySet()) {
            System.out.println(" key : "+entry.getKey());
            for(Map.Entry<Integer,List<String>> entry1 : entry.getValue().entrySet()) {
                System.out.println("version : "+entry1.getKey()+" , Value "+entry1.getValue());
            }
        }
    }
}
