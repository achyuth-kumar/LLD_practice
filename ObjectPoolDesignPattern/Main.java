public class Main {
    public static void main(String [] args) {
        DBConnection db=new DBConnection();
        Connection connection=db.createConnection("wynk","Achyuth","Achyuth@123");
        DBConnectionPoolManager dbManager= DBConnectionPoolManager.getInstance();
        dbManager= new DBConnectionPoolManager(connection);
        dbManager.getAllDBConnections();

        Connection connection1=dbManager.getDBConnection(connection);
        dbManager.releaseDBConnection(connection);
        dbManager.getAllDBConnections();
    }
}
