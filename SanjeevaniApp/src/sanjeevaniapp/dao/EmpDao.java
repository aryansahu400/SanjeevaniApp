/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmployeePojo;

/**
 *
 * @author LENOVO
 */
public class EmpDao {
     public static boolean addEmp(EmployeePojo emp) throws SQLException{
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("Insert into employees(?,?,?,?)");
          ps.setString(1,emp.getEmpId());
          ps.setString(2,emp.getEmpName());
          ps.setString(3,emp.getEmpDept());
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
        return "E101";
    }
}
