import java.util.*;

public class ConsistentHashing {
    public Integer NumberOfReplicas;
    public List<String> servers;
    public HashMap<String,String> ring;
    ConsistentHashing(Integer NumberOfReplicas,List<String> servers) {
        this.NumberOfReplicas=NumberOfReplicas;
        this.servers=new ArrayList<>(servers);
        this.ring=new HashMap<>();
    }
    public String hash() {
        Random random=new Random();
        return new String(String.valueOf(random.nextInt(this.NumberOfReplicas)));
    }
    public void AddServer(String server) {
        servers.add(server);
        for (int i = 0; i < NumberOfReplicas; i++) {
            ring.put(server + hash() + "-" + i, server);
        }
    }
    public void RemoveServer(String server) {
        servers.remove(server);
        for (int i = 0; i < NumberOfReplicas; i++) {
            ring.remove(server + hash() + "-");
        }
    }
    public String GetServer(String ServerKey) {
        for(Map.Entry<String,String> entry : ring.entrySet()) {
            if(entry.getKey().equals(ServerKey)) {
                return entry.getValue();
            }
        }
        return "";
    }
}
