public class Connection {

    public String Url,UserName,Password;
    Connection(String Url,String UserName,String Password) {
        this.Url=Url;
        this.UserName=UserName;
        this.Password=Password;
    }

    public String getUrl() {
        return this.Url;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getPassword() {
        return this.Password;
    }
}
