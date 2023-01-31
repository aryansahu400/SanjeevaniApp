
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmployeePojo;
import sanjeevaniapp.pojo.User;

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
     
}
