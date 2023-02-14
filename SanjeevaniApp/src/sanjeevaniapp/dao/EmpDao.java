/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmployeePojo;

/**
 *
 * @author LENOVO
 */
public class EmpDao {
     public static boolean addEmp(EmployeePojo emp) throws SQLException{
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?,?)");
          ps.setString(1,emp.getEmpId());
          ps.setString(2,emp.getEmpName());
          ps.setString(3,emp.getEmpDept().toUpperCase());
          ps.setDouble(4,emp.getEmpSal());
          return ps.executeUpdate()==1;
      }
      public static EmployeePojo adddEmp(String empId) throws SQLException{
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("Select * from employee Where emp_id=(?)");
          ps.setString(1,empId);
          ResultSet rs=ps.executeQuery();
          EmployeePojo emp=new EmployeePojo();
          emp.setEmpId(rs.getString(1));
          emp.setEmpName(rs.getString(2));
          emp.setEmpDept(rs.getString(3));
          emp.setEmpSal(rs.getDouble(4));
          
          return emp;
      }
    public static String getNextEmpId() throws SQLException{
       Connection conn=DBConnection.getConnection();
       Statement s=conn.createStatement();
       ResultSet rs=s.executeQuery("SELECT max(emp_id) FROM employees");
       rs.next();
       String str=rs.getString(1).substring(1);
       int n=Integer.parseInt(str);
       return "E"+(++n);
       
    }
    public static List<String> getAllEmployeeId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select emp_id FROM employees");
        List<String> list=new ArrayList<>();
        while(rs.next()){
            list.add(rs.getString(1));
        }
        return list;
    }
    public static EmployeePojo getEmloyeeDetails(String employeeId)throws SQLException{
        EmployeePojo emp=new EmployeePojo();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM employees where emp_id=?");
        ps.setString(1, employeeId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        emp.setEmpId(rs.getString(1));
        emp.setEmpName(rs.getString(2));
        emp.setEmpDept(rs.getString(3));
        emp.setEmpSal(Double.parseDouble(rs.getString(4)));
        return emp;
    }

    public static boolean updateEmployee(EmployeePojo emp)throws SQLException {
        UpdateName(emp);
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update employees set emp_name=?,emp_salary=? where emp_id=?");
        ps.setString(1, emp.getEmpName());
        ps.setDouble(2, emp.getEmpSal());
        ps.setString(3, emp.getEmpId());
        return ps.executeUpdate()==1;
    }

    private static void UpdateName(EmployeePojo emp)throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select emp_name from employees where emp_id=?");
        ps.setString(1,emp.getEmpId());
        ResultSet rs=ps.executeQuery();
        rs.next();
        String currentName=rs.getString(1);
        UserDao.updateUser(currentName, emp.getEmpName());
        if(emp.getEmpDept().equalsIgnoreCase("Doctor")){
            DoctorsDao.updateDoctor(currentName,emp.getEmpName());
        }else if(emp.getEmpDept().equalsIgnoreCase("Receptionist")){
            ReceptionistDao.updateReceptionist(currentName,emp.getEmpName());
        }
    }

    public static List<EmployeePojo> getAllEmployeeDetails() throws SQLException {
        List<EmployeePojo> list=new ArrayList<>();
        
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM employees order by emp_id ASC");
        while(rs.next()){
            EmployeePojo emp=new EmployeePojo();
            emp.setEmpId(rs.getString(1));
            emp.setEmpName(rs.getString(2));
            emp.setEmpDept(rs.getString(3));
            emp.setEmpSal(Double.parseDouble(rs.getString(4)));
            list.add(emp);
        }
        return list;
    }

    public static boolean removeEmployee(EmployeePojo emp) throws SQLException {
        UserDao.removeUser(emp.getEmpName());
        if(emp.getEmpDept().equalsIgnoreCase("doctor")){
            DoctorsDao.remove(emp.getEmpName());
            System.out.println("removed from doctor");
        }else if(emp.getEmpDept().equalsIgnoreCase("receptionist")){
            ReceptionistDao.remove(emp.getEmpName());
            System.out.println("removed from recetion table");
        }
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM employees where emp_id=?");
        ps.setString(1,emp.getEmpId());
        return ps.executeUpdate()==1;
    }
    
    public static Map<String,String> getUnregisteredDoctors()throws SQLException{
        Map<String,String> map=new HashMap<>();
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
        ResultSet rs=ps.executeQuery("SELECT emp_id,emp_name FROM employees WHERE emp_department='DOCTOR' AND emp_name NOT IN (SELECT user_name FROM users WHERE user_type='DOCTOR' ) ORDER BY EMP_ID");
        while(rs.next()){
            map.put(rs.getString(1),rs.getString(2));
        }
        return map;
    }
    public static Map<String,String> getUnregisteredReceptionists()throws SQLException{
        Map<String,String> map=new HashMap<>();
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
        ResultSet rs=ps.executeQuery("SELECT emp_id,emp_name FROM employees WHERE emp_department='RECEPTIONIST' AND emp_name NOT IN (SELECT user_name FROM users WHERE user_type='RECEPTIONIST' ) ORDER BY EMP_ID");
        while(rs.next()){
            map.put(rs.getString(1),rs.getString(2));
        }
        
        return map;
    }

}
