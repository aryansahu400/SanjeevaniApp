
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
}
