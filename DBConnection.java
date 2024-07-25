package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection con;

    public static Connection createDBConnection(String databaseName) {

            String driver = "com.mysql.cj.jdbc.Driver";

            String URL = "jdbc:mysql://localhost:3306/" + databaseName;
            String USER = "root"; // Update to your MySQL username
            String PASSWORD = "root123";
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(URL, USER, PASSWORD);

            } catch (Exception ex) {
                System.out.println(ex);

        }
            return con;


        }
    }
