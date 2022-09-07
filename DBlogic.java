import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/database1";
    String USERNAME = "root";
    String PASSWORD = "B@ib@m0m0f3";

    public void register(String username, String password) {

        try {
            //create connection and statement
            Connection conn = DriverManager.getConnection(DB, USERNAME, PASSWORD);
            Statement sql = conn.createStatement();

            // sql insert
            String register = "INSERT INTO users (username, password) VALUES ('"+ username +"', '"+ password +"')";

            sql.executeUpdate(register);

            System.out.println("Registration successful!");

        } catch (SQLException e) {
            e.printStackTrace();


        }

    }

}
