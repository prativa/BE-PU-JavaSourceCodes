
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Register JDBC driver

        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Boolean isUserNameAndPassswordInDatabase = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DatabaseUtility.getConnection();

            String query = "SELECT * FROM user_table WHERE username = ? AND password = ?";
            PreparedStatement sPreparedStatement = connection.prepareStatement(query);
            sPreparedStatement.setString(1, username);
            sPreparedStatement.setString(2, password);
            ResultSet resultSet = sPreparedStatement.executeQuery();
            if (resultSet.next()) {
                isUserNameAndPassswordInDatabase = true;

            }
            resultSet.close();
            sPreparedStatement.close();
            connection.close();

            if (isUserNameAndPassswordInDatabase) {
                response.sendRedirect("welcome.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException e2) {

        } catch (IOException ioe) {

        }
    }

}
