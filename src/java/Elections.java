import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;


public class Elections extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String name=request.getParameter("uname");
            String age=request.getParameter("uage");
            String consty=request.getParameter("uconst");
            String party=request.getParameter("uparty");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joshua","root","root");
            PreparedStatement ps = con.prepareStatement("insert into election values(?,?,?,?)"); 
            ps.setString(1,name);
            ps.setString(2,age);
            ps.setString(3,consty);
            ps.setString(4,party);
            int i=ps.executeUpdate();
            out.println(i+"Thanks for Voting"); 

    }
        catch(Exception e)
{
    System.out.println(e);
}
    }

  
}