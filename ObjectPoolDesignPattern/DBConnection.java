public class DBConnection {
    public Connection createConnection(String Url,String UserName,String Password) {
        return new Connection(Url,UserName,Password);
    }
}
