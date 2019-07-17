package sashokTestServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello-world")
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        String attr1 = (String) req.getAttribute("attr1");

//        String attr1 = (String)req.getSession().getAttribute("attr1");
//        req.getSession().removeAttribute("attr1");
//        resp.getWriter().println("Hello world: "+attr1);

        PrintWriter out = resp.getWriter();
        out.println("Hello world ::: MY HELLO WORLD servlet   " + attr1);
//out.close();
    }
}