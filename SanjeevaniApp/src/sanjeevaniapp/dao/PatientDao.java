
package sanjeevaniapp.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import sanjeevaniapp.pojo.PatientPojo;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import sanjeevaniapp.util.DBConnection;

public class PatientDao {
    public static List<PatientPojo> getAllDetails()throws SQLException{
        List<PatientPojo> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        ResultSet rs=conn.createStatement().executeQuery("Select * from patients");
        while(rs.next()){
            PatientPojo patient=new PatientPojo();
            patient.setAddress(rs.getString("address"));
            patient.setAge(rs.getInt("age"));
            patient.setCity(rs.getString("city"));
            patient.setDate(rs.getDate("p_date"));
            patient.setDoctorId(rs.getString("doctor_id"));
            patient.setFirstName(rs.getString("first_name"));
            patient.setGender(rs.getString("gender"));
            patient.setLastname(rs.getString("last_name"));
            patient.setMobileNo(rs.getString("mobile_no"));
            patient.setOpd(rs.getString("opd"));
            patient.setPatientId(rs.getString("patient_id"));
            patient.setStatus(rs.getString("status"));
            patient.setmStatus(rs.getString("m_status"));
            
            list.add(patient);
        }
        return list;
    }
    
    public static String getNextId()throws SQLException{
         Connection conn=DBConnection.getConnection();
            Statement s=conn.createStatement();
            ResultSet rs=s.executeQuery("SELECT max(patient_id) FROM patients");
            rs.next();
       try{
        String str=rs.getString(1).substring(1);
        int n=Integer.parseInt(str);
        return "P"+(++n);
       }catch(Exception e){
           return "P101";
       }
    }
    public static boolean insertRecord(PatientPojo patient)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO PATIENTS VALUES(?,?,?, ?,?,?,?,?,?,?,?,?,?,?)");
//        ps.setString(1, "PATIENT_ID");
//        ps.setString(2,"FIRST_NAME");
//        ps.setString(3,"LAST_NAME");
//        ps.setString(4,"AGE");
//        ps.setString(5,"GENDER");
//        ps.setString(6, "M_STATUS");
//        ps.setString(7, "ADDRESS");
//        ps.setString(8, "CITY");
//        ps.setString(9, "MOBILE_NO");
//        ps.setString(10, "P_DATE");
//        ps.setString(11, "OTP");
//        ps.setString(12, "OPD");
//        ps.setString(13, "DOCTOR_ID");
        
        
        ps.setString(1, patient.getPatientId());
        ps.setString(2, patient.getFirstName());
        ps.setString(3, patient.getLastname());
        ps.setInt(4, patient.getAge());
        ps.setString(5, patient.getGender());
        ps.setString(6, patient.getmStatus());
        ps.setString(7, patient.getAddress());
        ps.setString(8, patient.getCity());
        ps.setString(9, patient.getMobileNo());
        ps.setDate(10, patient.getDate());
        ps.setInt(11, patient.getOtp());
        ps.setString(12, patient.getOpd());
        ps.setString(13, patient.getDoctorId());
        ps.setString(14,"null");
        
        return ps.executeUpdate()==1;
    }
    
    public static boolean updatePatient(PatientPojo patient)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE PATIENTS SET PATIENT_ID=?,FIRST_NAME=?,LAST_NAME=?,AGE=?,GENDER=?,M_STATUS=?,ADDRESS=?,CITY=?,MOBILE_NO=?,"
                + "P_DATE=?,OTP=?,OPD=?,DOCTOR_ID=? WHERE PATIENT_ID=?");
//        ps.setString(1, "PATIENT_ID");
//        ps.setString(3,"FIRST_NAME");
//        ps.setString(5,"LAST_NAME");
//        ps.setString(7,"AGE");
//        ps.setString(9,"GENDER");
//        ps.setString(11, "M_STATUS");
//        ps.setString(13, "ADDRESS");
//        ps.setString(15, "CITY");
//        ps.setString(17, "MOBILE_NO");
//        ps.setString(19, "P_DATE");
//        ps.setString(21, "OTP");
//        ps.setString(23, "OPD");
//        ps.setString(25, "DOCTOR_ID");
//        ps.setString(27, "STATUS");
        
        
        ps.setString(1, patient.getPatientId());
        ps.setString(2, patient.getFirstName());
        ps.setString(3, patient.getLastname());
        ps.setInt(4, patient.getAge());
        ps.setString(5, patient.getGender());
        ps.setString(6, patient.getmStatus());
        ps.setString(7, patient.getAddress());
        ps.setString(8, patient.getCity());
        ps.setString(9, patient.getMobileNo());
        ps.setDate(10, new java.sql.Date(patient.getDate().getTime()));
        ps.setInt(11, patient.getOtp());
        ps.setString(12, patient.getOpd());
        ps.setString(13, patient.getDoctorId());
        
        
        ps.setString(14,patient.getPatientId());
        
        return ps.executeUpdate()==1;
    }
    public static PatientPojo loadPatientDetails(String patientId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM patients WHERE patient_id=?");
        ps.setString(1, patientId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        PatientPojo patient=new PatientPojo();
        patient.setAddress(rs.getString("address"));
        patient.setAge(rs.getInt("age"));
        patient.setCity(rs.getString("city"));
        patient.setDate(new java.sql.Date(rs.getDate("p_date").getTime()));
        patient.setDoctorId(rs.getString("doctor_id"));
        patient.setFirstName(rs.getString("first_name"));
        patient.setGender(rs.getString("gender"));
        patient.setLastname(rs.getString("last_name"));
        patient.setMobileNo(rs.getString("mobile_no"));
        patient.setOpd(rs.getString("opd"));
        patient.setPatientId(rs.getString("patient_id"));
        patient.setStatus(rs.getString("status"));
        patient.setmStatus(rs.getString("m_status"));
            
        return (patient);
        
        
    }
    
    
    
    public static List<String> getAllIds()throws SQLException{
        Connection conn=DBConnection.getConnection();
        List<String> list=new ArrayList<>();
        ResultSet rs=conn.createStatement().executeQuery("Select PATIENT_ID from patients");
        while(rs.next()){
            list.add(rs.getString(1));
        }
        return list;
    }
    public static boolean removePatient(String patientId) throws SQLException {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM patients where patient_id=?");
        ps.setString(1,patientId);
        return ps.executeUpdate()==1;
    }
        
    
}
