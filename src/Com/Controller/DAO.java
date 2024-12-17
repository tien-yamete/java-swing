package Com.Controller;

import java.sql.*;


public class DAO {
    private Connection conn;

    public Connection getConn() {
        return conn;
    }
    
    public DAO(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CafeManagement;user=sa;password=814362;encrypt =  false;");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}
