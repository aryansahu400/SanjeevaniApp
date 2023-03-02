/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sanjeevaniapp.util.DBConnection;
import sanjeevaniapp.pojo.DoctorsPojo;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author LENOVO
 */
public class DoctorsDao {

    public static String getNameById(String id)throws SQLException{
        Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
       ps.setString(1, id);
       ResultSet rs=ps.executeQuery();
       rs.next();
           
       return rs.getString(1);
    }
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
        ps.setString(3, doc.getEmailId());
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
    
    public static List<String> getAllDoctorIds()throws SQLException{
        List<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT doctor_id FROM doctors");
        while(rs.next()){
            list.add(rs.getString(1));
        }
        return list;
    }
    public static boolean removeDoctorById(String docId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
        
        ps.setString(1,docId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())UserDao.removeUser(rs.getString(1));
        ps=conn.prepareStatement("DELETE FROM doctors where doctor_id=?");
        ps.setString(1, docId);
        return ps.executeUpdate()==1;
    }
    public static List<DoctorsPojo> getAllDoctorDetails() throws SQLException{
        List<DoctorsPojo> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement s= conn.createStatement();
        ResultSet rs=s.executeQuery("Select * from doctors order by doctor_id");
        while(rs.next()){
            DoctorsPojo doctor=new DoctorsPojo();
            doctor.setDoctorName(rs.getString("doctor_name"));
            doctor.setDoctorId(rs.getString("doctor_id"));
            doctor.setGender(rs.getString("gender"));
            doctor.setEmailId(rs.getString("email_id"));
            doctor.setContact(rs.getString("contact_no"));
            doctor.setQualification(rs.getString("QUALIFICATION"));
            doctor.setSpecilist(rs.getString("SPECIALIST"));
            list.add(doctor);
            
        }
        return list;
    }
    
}
