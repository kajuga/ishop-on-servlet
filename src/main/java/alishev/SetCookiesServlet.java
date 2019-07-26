package alishev;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookieONE = new Cookie("some_id", "123");
        Cookie cookieTWO = new Cookie("some_id_TWO", "123_321_123");
        cookieONE.setMaxAge(24 * 60 *60);
        cookieTWO.setMaxAge(24 * 60 *60);
        response.addCookie(cookieONE);
        response.addCookie(cookieTWO);



    }
}
