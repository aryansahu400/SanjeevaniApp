/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author LENOVO
 */
public class AppointmentPojo {
    private String patientId;

    public AppointmentPojo(String patientId, String patientName, String status, String OPD, String dateTime, String doctorName, String MobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.status = status;
        this.OPD = OPD;
        this.dateTime = dateTime;
        this.doctorName = doctorName;
        this.MobileNo = MobileNo;
    }
    private String patientName;
    private String status;
    private String OPD;
    private String dateTime;
    private String doctorName;
    private String MobileNo;
    
    public AppointmentPojo(){
        
    }
    
    

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOPD() {
        return OPD;
    }

    public void setOPD(String OPD) {
        this.OPD = OPD;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }
}
