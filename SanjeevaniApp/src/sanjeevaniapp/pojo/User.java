package sanjeevaniapp.pojo;
public class User{
    private static String loginId;
    private static String password;
    private static String userType;

    
    
    public static String getLoginId() {
        return loginId;
    }

    public static void setLoginId(String loginId) {
        User.loginId = loginId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String userName) {
        User.password = userName;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        User.userType = userType;
    }

    
}
 