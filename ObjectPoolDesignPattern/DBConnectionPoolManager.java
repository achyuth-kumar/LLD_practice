import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    List<Connection> Inpool=new ArrayList<>();
    List<Connection> InUse=new ArrayList<>();
    public static int initial_poll_size=3;
    public static int max_poll_size=6;
    private static DBConnectionPoolManager dbConnectionPoolManagerInstance=null;
    DBConnectionPoolManager(Connection connection) {
        for(int i=0;i<initial_poll_size;i++) {
            Inpool.add(connection);
        }
    }
    DBConnectionPoolManager() {

    }
    public static DBConnectionPoolManager getInstance() {
        if(dbConnectionPoolManagerInstance==null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance= new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }
    public Connection getDBConnection(Connection connection) {
        if(!Inpool.isEmpty() && Inpool.size()<initial_poll_size) {
            Inpool.add(connection);
        }
        else if(!Inpool.isEmpty() && Inpool.size()>=max_poll_size) {
            InUse.remove(connection);
            return null;
        }
        Inpool.remove(Inpool.size()-1);
        InUse.add(connection);
        int lastIndex=InUse.size()-1;
        return InUse.get(lastIndex);
    }
    public void releaseDBConnection(Connection connection) {
        if(connection!=null) {
            InUse.remove(connection);
            Inpool.add(connection);
        }
    }
    public void getAllDBConnections() {
        System.out.println("Inpool connection : ");
        for(Connection connection : Inpool) {
            System.out.println(connection.getUrl()+" : "+connection.getUserName()+" : "+connection.getPassword());
        }

        System.out.println("Inuse connection : ");
        for(Connection connection : InUse) {
            System.out.println(connection.getUrl()+" : "+connection.getUserName()+" : "+connection.getPassword());
        }
    }
}
