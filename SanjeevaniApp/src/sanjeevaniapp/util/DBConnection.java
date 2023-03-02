package sanjeevaniapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Aryansahu400","sanjeevaniapp","abc");
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
   
}

