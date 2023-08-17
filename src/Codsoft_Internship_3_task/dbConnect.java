package Codsoft_Internship_3_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
//    private static Connection mycon=null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String user = "prince";
        String pass="@258Prince";
        String url = "jdbc:mysql://localhost:3306/student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}

