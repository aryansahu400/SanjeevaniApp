
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.pojo.UserPojo;

public class UserDao {
    public static String validateUser(User user) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
        ps.setString(1, user.getLoginId());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        String name=null;
        if(rs.next()){
            name=rs.getString("user_name");
        }
        return name;
    }

    public static boolean updateUser(String currentName, String empName)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE users SET user_name=? where user_name=?");
        ps.setString(1,empName);
        ps.setString(2,currentName);
        return ps.executeUpdate()==1;
    }

    public static boolean removeUser(String empName) throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE users where user_name=?");
        ps.setString(1,empName);
        return ps.executeUpdate()==1;

    }
    
    public static boolean addUser(UserPojo user) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
        ps.setString(1,user.getLoginId());
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUserType());
        return ps.executeUpdate()==1;
    }
    public static String getLoginIdByName(String userName)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT login_id from users where user_name=?");
        ps.setString(1, userName);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
    }
    public static boolean updateLoginIdByName(String userName,String loginId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE USERS SET LOGIN_ID=? where USER_NAME=?");
        ps.setString(1,loginId);
        ps.setString(2,userName);
        return ps.executeUpdate()==1;
    }
    
     
}
