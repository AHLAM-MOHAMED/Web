import javax.jms.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "StudentServlet2")
public class StudentServlet2 extends HttpServlet {
    private static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private static String DB_URL ="jdbc:mysql://localhost:3306/bitam";
    private static String DB_USER ="root";
    private static String DB_PASS ="";

    static final String USER ="root";
    static final String PASS ="";

    protected  void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try{
            PrintWriter out = response.getWriter();
            String Name = request.getParameter("name");
            String Grade = request.getParameter("grade");
            String PhoneNo = request.getParameter("Pno");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            Statement st = ((java.sql.Connection) conn).createStatement();

            String select = "SELECT * FROM wanafunzi WHERE Name = "+Name+" AND Grade = "+Grade+" ";
            ResultSet RS = st.executeQuery(select);
            while (RS.next());
            String name = RS.getString("name");
            String grade = RS.getString("grade");
            String phoneNo = RS.getString("phoneNo");

        }
        catch (Exception se){

        }

    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
