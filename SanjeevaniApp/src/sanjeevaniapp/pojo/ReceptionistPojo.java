/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author LENOVO
 */
public class ReceptionistPojo {
    private String receptionistId;
    private String receptionistName;
    private String gender;

    public String getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ReceptionistPojo(String receptionistId, String receptionistName, String gender) {
        this.receptionistId = receptionistId;
        this.receptionistName = receptionistName;
        this.gender = gender;
    }

    public ReceptionistPojo() {
    }
}
