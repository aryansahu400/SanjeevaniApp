/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class EmpDao {
    private static Connection conn;
    static{
        conn=DBConnection.getConnection();
    }
    public static boolean addEmp(EmpPojo emp)throws SQLException{
        
        PreparedStatement ps=conn.prepareStatement("insert into empproj VALUES(?,?,?)");
        ps.setInt(1,emp.getEmpNo());
        ps.setString(2, emp.getEmpName());
        ps.setDouble(3, emp.getEmpsal());
        int ans=ps.executeUpdate();
        return (ans==1);
    }
    public static EmpPojo findEmpByEmpNo(int eno)throws SQLException{
        PreparedStatement ps=conn.prepareStatement("Select * from empproj where enpno=?");
        ps.setInt(1,eno);
        ResultSet rs=ps.executeQuery();
        EmpPojo emp=null;
        if(rs.next()){
            emp=new EmpPojo();
            emp.setEmpNo(rs.getInt(1));
            emp.setEmpName(rs.getString(2));
            emp.setEmpsal(rs.getDouble(3));
            
        }
        return emp;
    }
    public static List<EmpPojo> getAllEmployees() throws SQLException{
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from empproj");
        List<EmpPojo> empList=new ArrayList<>();
        while(rs.next()){
            EmpPojo emp=new EmpPojo();
            emp.setEmpNo(rs.getInt(1));
            emp.setEmpName(rs.getString(2));
            emp.setEmpsal(rs.getDouble(3));
            empList.add(emp);
            
        }
        return empList;
    }
    public static boolean deleteEmployee(int empNo)throws SQLException{
        PreparedStatement ps=conn.prepareStatement("DELETE FROM empproj WHERE enpno=?");
        ps.setInt(1,empNo);
        if(ps.executeUpdate()==1)return true;
        else return false;
    }
    public static boolean updateEmployeeSal(EmpPojo emp)throws SQLException{
        PreparedStatement ps=conn.prepareStatement("UPDATE empproj SET empsal=? WHERE enpno=?");
        ps.setDouble(1, emp.getEmpsal());
        ps.setInt(2,emp.getEmpNo());
        if(ps.executeUpdate()==1)return true;
        else return false;
    }
}
