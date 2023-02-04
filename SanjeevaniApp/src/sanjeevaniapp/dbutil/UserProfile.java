/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dbutil;

public class UserProfile {

    

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    public static String getLoginId() {
        return loginId;
    }

    public static void setLoginId(String loginId) {
        UserProfile.loginId = loginId;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserProfile.userType = userType;
    }
    private static String username;
    private static String loginId;
    private static String userType;
    
}
