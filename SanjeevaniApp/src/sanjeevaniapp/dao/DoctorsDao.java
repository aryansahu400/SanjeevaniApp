/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.DoctorsPojo;
import java.sql.ResultSet;
/**
 *
 * @author LENOVO
 */
public class DoctorsDao {

    public static void updateDoctor(String currentName, String empName)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE doctors SET doctor_name=? where doctor_name=?");
        ps.setString(1,empName);
        ps.setString(2,currentName);
        ps.executeUpdate();
    }

    public static void remove(String empName) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM doctors where doctor_name=?");
        ps.setString(1,empName);
        ps.executeUpdate();
    }
    
    public static boolean addDoctor(DoctorsPojo doc) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)");
        ps.setString(1, doc.getDoctorId());
        ps.setString(2, doc.getDoctorName());
        ps.setString(3, doc.getEmail());
        ps.setString(4, doc.getContact());
        ps.setString(5, doc.getQualification());
        ps.setString(6, doc.getGender());
        ps.setString(7, doc.getSpecilist());
        return ps.executeUpdate()==1;
    }
    
    public static String getNewDocId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select max(DOCTOR_ID) FROM doctors");
        String id=null;
        rs.next();
        if(rs.getString(1)==null){
            return "DOC101";
        }else{
            int n=Integer.parseInt(rs.getString(1).substring(3))+1;
            return "DOC"+n;
        }
    }
    
    
}
