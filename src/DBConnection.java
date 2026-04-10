import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Change these to match your MySQL setup
    private static final String URL = "jdbc:mysql://localhost:3306/scholarship_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Kingshuk@476#.me"; // <-- change this

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found!", e);
        }
    }
}