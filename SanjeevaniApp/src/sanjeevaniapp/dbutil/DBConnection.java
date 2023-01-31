package sanjeevaniapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded Successfully");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Aryansahu400","sanjeevaniapp","abc");
            System.out.println("Connection open successfully");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }catch(SQLException e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("Connection closed successfully");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        closeConnection();
    }
}

