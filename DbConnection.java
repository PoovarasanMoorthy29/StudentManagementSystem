package StudentManagementSystem;

//Import essential libraries.
import java.sql.*;
public class DbConnection {
    private final static String url="jdbc:postgresql://localhost:5432/student"; //url
    private final static String username="postgres"; //username for the database
    private final static String password="290504"; //password

    public static Connection getConnect()throws Exception {

        Connection connectDB = null;
        try {
            connectDB = DriverManager.getConnection(url, username, password); //connecting the database

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectDB;


    }
}
