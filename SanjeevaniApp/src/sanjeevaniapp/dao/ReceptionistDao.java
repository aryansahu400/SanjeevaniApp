/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import sanjeevaniapp.dbutil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class ReceptionistDao {

    static void updateReceptionist(String currentName, String empName)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE receptionists SET receptionist_name=? where receptionist_name=?");
        System.out.println("old name: "+currentName+" new Name: "+empName);
        ps.setString(1,empName);
        ps.setString(2,currentName);
        ps.executeUpdate();
        System.out.println("updated!");
    }

    static void remove(String empName)  throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM receptionists where receptionist_name=?");
        ps.setString(1,empName);
        ps.executeUpdate();
    }
    
}
