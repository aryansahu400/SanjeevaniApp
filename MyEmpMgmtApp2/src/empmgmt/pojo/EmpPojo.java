/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empmgmt.pojo;

/**
 *
 * @author LENOVO
 */
public class EmpPojo {

    public EmpPojo() {
        
    }

    public EmpPojo(int empNo, String empName, double empsal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empsal = empsal;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpsal() {
        return empsal;
    }

    public void setEmpsal(double empsal) {
        this.empsal = empsal;
    }
    private int empNo;
    private String empName;
    private double empsal;
    @Override
    public String toString(){
        return (empNo+"\t\t"+empName+"\t\t"+empsal+"\n");
    }
    
}
