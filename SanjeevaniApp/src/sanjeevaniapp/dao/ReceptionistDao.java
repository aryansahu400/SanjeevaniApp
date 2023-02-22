/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import sanjeevaniapp.util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.pojo.ReceptionistPojo;
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
    
    public static String getNewReceptionistId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select max(Receptionist_ID) FROM Receptionists");
        String id=null;
        rs.next();
        if(rs.getString(1)==null){
            return "REC101";
        }else{
            int n=Integer.parseInt(rs.getString(1).substring(3))+1;
            return "REC"+n;
        }
    }
    
    public static boolean addReceptionist(ReceptionistPojo rec) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into receptionists values(?,?,?)");
        ps.setString(1, rec.getReceptionistId());
        ps.setString(2, rec.getReceptionistName());
        ps.setString(3, rec.getGender());
        return ps.executeUpdate()==1;
    }
    
    public static List<ReceptionistPojo> getAllreceptonistDetails() throws SQLException{
        List<ReceptionistPojo> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement s= conn.createStatement();
        ResultSet rs=s.executeQuery("Select * from Receptionists order by Receptionist_id");
        while(rs.next()){
            ReceptionistPojo doctor=new ReceptionistPojo();
            doctor.setReceptionistName(rs.getString("Receptionist_name"));
            doctor.setReceptionistId(rs.getString("Receptionist_id"));
            doctor.setGender(rs.getString("gender"));
            
            list.add(doctor);
            
        }
        return list;
    }
    public static List<String> getAllReceptionistIds()throws SQLException{
        List<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select RECEPTIONIST_ID from receptionists");
        while(rs.next()){
            list.add(rs.getString(1));
        }
        return list;
    }
    
    public static boolean removeReceptionistById(String receptionistId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
        
        ps.setString(1,receptionistId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())UserDao.removeUser(rs.getString(1));
        ps=conn.prepareStatement("DELETE FROM receptionists where receptionist_id=?");
        ps.setString(1, receptionistId);
        return ps.executeUpdate()==1;
    }
    public static ReceptionistPojo getReceptonistDetailsById(String id) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement s=conn.prepareStatement("SELECT * FROM Receptionists WHERE receptionist_id=?");
        s.setString(1, id);
        ResultSet rs=s.executeQuery();
        rs.next();
        ReceptionistPojo receptionist=new ReceptionistPojo();
        receptionist.setReceptionistName(rs.getString("Receptionist_name"));
        receptionist.setReceptionistId(rs.getString("Receptionist_id"));
        receptionist.setGender(rs.getString("gender"));
        return  receptionist;
    }
    public static boolean updateGenderById(String id, String gender)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE RECEPTIONISTS SET GENDER=? where RECEPTIONIST_ID=?");
        ps.setString(1,gender);
        ps.setString(2,id);
        return ps.executeUpdate()==1;
    }
}
