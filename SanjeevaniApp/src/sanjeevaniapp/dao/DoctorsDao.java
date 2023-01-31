/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;

/**
 *
 * @author LENOVO
 */
public class DoctorsDao {

    static void updateDoctor(String currentName, String empName)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE doctors SET doctor_name=? where receptionists_name=?");
        ps.setString(1,empName);
        ps.setString(2,currentName);
        ps.executeUpdate();
    }
    
}
