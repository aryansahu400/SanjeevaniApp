
package sanjeevaniapp.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import sanjeevaniapp.pojo.PatientPojo;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import sanjeevaniapp.pojo.AppointmentPojo;
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
        String doctorName=DoctorsDao.getNameById(patient.getDoctorId());
        AppointmentPojo appointment=new AppointmentPojo(patient.getPatientId(),patient.getFirstName()+" "+patient.getLastname(), "REQUEST", patient.getOpd(), patient.getDate().toString(), doctorName, patient.getMobileNo());
        if(!AppointmentDao.addAppointment(appointment)){
            throw new SQLException();
        }
        
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
        ps.setString(14,"REQUEST");
        
        return ps.executeUpdate()==1;
    }
    
    public static boolean updatePatient(PatientPojo patient)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE PATIENTS SET PATIENT_ID=?,FIRST_NAME=?,LAST_NAME=?,AGE=?,GENDER=?,M_STATUS=?,ADDRESS=?,CITY=?,MOBILE_NO=?,"
                + "P_DATE=?,OTP=?,OPD=?,DOCTOR_ID=? WHERE PATIENT_ID=?");
         String doctorName=DoctorsDao.getNameById(patient.getDoctorId());
        AppointmentPojo appointment=new AppointmentPojo(patient.getPatientId(),patient.getFirstName()+" "+patient.getLastname(), "REQUEST", patient.getOpd(), patient.getDate().toString(), doctorName, patient.getMobileNo());
        if(!AppointmentDao.addAppointment(appointment)){
            throw new SQLException();
        }
        
        
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
        if(AppointmentDao.removeAppointment(patientId)){
            ps.setString(1,patientId);
            return ps.executeUpdate()==1;
        }return false;
    }
        
    
}
