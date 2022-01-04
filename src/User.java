public class User {
   private  String username;
   private   String password;
   private   String phoneNumber;
     private boolean isRegular;

    public User (String username, String password, String phoneNumber, boolean isRegular ){
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isRegular = isRegular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }
}
