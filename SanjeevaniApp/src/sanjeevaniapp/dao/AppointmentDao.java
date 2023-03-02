package sanjeevaniapp.dao;

import sanjeevaniapp.pojo.AppointmentPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.util.DBConnection;
public class AppointmentDao {
    public static boolean addAppointment(AppointmentPojo app)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO appointments VALUES(?,?,?,?,?,?,?)");
        ps.setString(1, app.getPatientId());
        ps.setString(2,app.getPatientName());
        ps.setString(3,app.getStatus());
        ps.setString(4,app.getOPD());
        ps.setString(5,app.getDateTime());
        ps.setString(6,app.getDoctorName());
        ps.setString(7,app.getMobileNo());
        
        return ps.executeUpdate()==1;
    }
    
    public static List<AppointmentPojo> getAppointmentsByDoctorName(String doctorName) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM appointments WHERE doctor_name=? and status=? order by patient_id");
        ps.setString(1,doctorName);
        ps.setString(2, "REQUEST");
        java.sql.ResultSet rs=ps.executeQuery();
        List<AppointmentPojo> list=new ArrayList<>();
        while(rs.next()){
           AppointmentPojo app=new AppointmentPojo();
           app.setPatientId(rs.getString(1));
           app.setPatientName(rs.getString(2));
           app.setStatus("REQUEST");
           app.setOPD(rs.getString(4));
           
           app.setDateTime(rs.getString(5));
           app.setDoctorName(rs.getString(6));
           app.setMobileNo(rs.getString(7));
           list.add(app);
        }
        return list;
           
    } 
    public static List<AppointmentPojo> getConfirmedAppointmentsByDoctorName(String doctorName) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM appointments WHERE doctor_name=? and status=? order by patient_id");
        ps.setString(1,doctorName);
        ps.setString(2, "CONFIRMED");
        java.sql.ResultSet rs=ps.executeQuery();
        List<AppointmentPojo> list=new ArrayList<>();
        while(rs.next()){
           AppointmentPojo app=new AppointmentPojo();
           app.setPatientId(rs.getString(1));
           app.setPatientName(rs.getString(2));
           app.setStatus("CONFIRMED");
           app.setOPD(rs.getString(4));
           
           app.setDateTime(rs.getString(5));
           app.setDoctorName(rs.getString(6));
           app.setMobileNo(rs.getString(7));
           list.add(app);
        }
        return list;
    }
    public static boolean updateStatus(AppointmentPojo appointment)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE appointments set status=?, date_time=? where patient_id=?");
        ps.setString(1,appointment.getStatus());
        ps.setString(2, appointment.getDateTime());
        ps.setString(3,appointment.getPatientId());
        
        return ps.executeUpdate()==1;
       
    }
     public static boolean removeAppointment(String patientId) throws SQLException {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM appointments where patient_id=?");
        ps.setString(1,patientId);
        return ps.executeUpdate()==1;
    }
        
}
