public class User {
    public User(String userId, String name, String pincode) {
        this.userId = userId;
        this.name = name;
        this.pincode = pincode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    String userId;
    String name;
    String pincode;

}
