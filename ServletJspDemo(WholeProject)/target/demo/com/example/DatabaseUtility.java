
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility {

    // Open a connection
    public static final String url = "jdbc:mysql://localhost:3306/jdbclab";
    public static final String username = "root";
    public static final String password = "@pplic@tion";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        }

        return conn;
    }

}
