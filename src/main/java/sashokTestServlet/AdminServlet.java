//package sashokTestServlet;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import static jdk.nashorn.internal.runtime.regexp.RegExpFactory.validate;
//
///**
// * @author Fedorov;
// */
//
//@WebServlet(value = "/admin", initParams = {
//        @WebInitParam(name = "ip", value = "22.22.22.22"),
//        @WebInitParam(name = "accessKey", value = "secret"),
//        @WebInitParam(name = "login", value = "admin"),
//        @WebInitParam(name = "password", value = "password")
//})
//    public class AdminServlet extends HttpServlet {
//    private String ip;
//    private String accessKey;
//    private String login;
//    private String password;
//
//    @Override
//    public void init() throws ServletException {
//        ip = getServletConfig().getInitParameter(ip);
//        accessKey = getServletConfig().getInitParameter(accessKey);
//        login = getServletConfig().getInitParameter(login);
//        password = getServletConfig().getInitParameter(password);
//
//    }
//
//
//
//
//
//
//}
//
//
