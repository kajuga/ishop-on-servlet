package sashokTestServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author kajuga
 */

@WebServlet("/fs")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1 style=\"background-color:DodgerBlue;\"> Hello, " + name + " " + surname +" </h1>");
        pw.println("<h3 style=\"color:Tomato;\">SERVLET FROM Alishev cources! </h3>");
        pw.println("<h2 style=\"border:2px solid DodgerBlue;\">TEST BORDER!</h3>");
        pw.println("</html>");

//        response.sendRedirect("https://www.google.com");
//        response.sendRedirect("/ishop-on-servlet/testJsp.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
        dispatcher.forward(request,response);

    }
}








