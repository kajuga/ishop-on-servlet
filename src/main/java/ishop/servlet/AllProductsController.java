package ishop.servlet;

import ishop.util.RoutingUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet("/products")
public class AllProductsController extends AbstractController{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<?> products = Collections.emptyList(); //get Products from database
        req.setAttribute("products", products);
        RoutingUtils.forwardToPage("products.jsp", req, resp);
    }
}