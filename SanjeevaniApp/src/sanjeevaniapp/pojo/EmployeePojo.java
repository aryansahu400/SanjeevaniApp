/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author LENOVO
 */
public class EmployeePojo {
    private String EmpId;
    private String EmpDept;
    private String EmpName;
    private Double EmpSal;
    public EmployeePojo(){
        
    }
    public EmployeePojo(String EmpId, String EmpDept, String EmpName, Double EmpSal) {
        this.EmpId = EmpId;
        this.EmpDept = EmpDept;
        this.EmpName = EmpName;
        this.EmpSal = EmpSal;
    }
    
    
    //EmpName EmpDept EmpSal

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String EmpDept) {
        this.EmpDept = EmpDept;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(double EmpSal) {
        this.EmpSal = EmpSal;
    }
    
}
