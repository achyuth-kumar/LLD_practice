import java.util.Map;
public class MyHashMap<K,V> {
    public static final int max_size=10;
    Entry [] hashTable;
    MyHashMap() {
        hashTable=new Entry[max_size];
    }
    MyHashMap(int sz) {
        hashTable=new Entry[sz];
    }
    class Entry<K,V> {

        K key;
        V value;
        Entry next;

        public Entry(K key,V value) {
            this.value = value;
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }
    }
    public void put(K key,V value) {
        int hashCode=key.hashCode()%max_size;
        Entry node=hashTable[hashCode];
        if(node==null) {
            Entry newNode=new Entry(key,value);
            hashTable[(int) key]=newNode;
        }
        else {
            while(node!=null) {
                if(node.key==key) {
                    node.value=value;
                    return ;
                }
                node=node.next;
            }
        }
    }
    public V get(K key) {
        int hashCode=key.hashCode()%max_size;
        Entry node=hashTable[hashCode];
        while(node!=null) {
            if(node.key==key) {
                return (V) node.value;
            }
            node=node.next;
        }
        return null;
    }
    public static void main(String args[]) {
        MyHashMap<Integer,String> mpp=new MyHashMap<>(max_size);
        mpp.put(1,"Achyuth");
        mpp.put(2,"Kumar");
        System.out.println("Before update");
        System.out.println(mpp.get(1));
        System.out.println(mpp.get(2));
        System.out.println("After update");
        mpp.put(1,"Allu Arjun");
        System.out.println(mpp.get(1));
        System.out.println(mpp.get(2));
    }
}