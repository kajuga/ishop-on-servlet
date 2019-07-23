package sashokTestServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookies")
public class ServletCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie c = new Cookie("author", "kajuga");
        c.setMaxAge(1800); // if negative,the cookie is not stored; if zero, deletes the cookie
        c.setPath("/");
        c.setHttpOnly(true);
        resp.addCookie(c);
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Hello cookies!");
        out.println("</body></html>");
        out.close();


    }
}


