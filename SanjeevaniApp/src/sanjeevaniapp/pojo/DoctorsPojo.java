/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author LENOVO
 */
public class DoctorsPojo {
    private String doctorId;
    private String doctorName;
    private String emailId;
    private String contact;
    private String qualification;
    private String gender;
    
    public DoctorsPojo(){
        
    }

    public DoctorsPojo(String doctorId, String doctorName, String emailId, String contact, String qualification, String gender, String specilist) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.emailId = emailId;
        this.contact = contact;
        this.qualification = qualification;
        this.gender = gender;
        this.specilist = specilist;
    }
    private String specilist;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String email) {
        this.emailId = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String genfer) {
        this.gender = genfer;
    }

    public String getSpecilist() {
        return specilist;
    }

    public void setSpecilist(String specilist) {
        this.specilist = specilist;
    }
}
