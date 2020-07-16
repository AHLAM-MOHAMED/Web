import javax.jms.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentServlet extends javax.servlet.http.HttpServlet {
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
            String RegNo = request.getParameter("reg");
            String Grade = request.getParameter("grade");
            String PhoneNo = request.getParameter("Pno");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            String course = request.getParameter("course");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            Statement st = ((java.sql.Connection) conn).createStatement();

            String select = "SELECT * FROM wanafunzi WHERE course = "+course+" AND RegNo = "+RegNo+" ";
            ResultSet RS = st.executeQuery(select);
            while (RS.next());
            String Course = RS.getString("course");
            String regNo = RS.getString("regNo");


        }
        catch (Exception se){

        }



    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
