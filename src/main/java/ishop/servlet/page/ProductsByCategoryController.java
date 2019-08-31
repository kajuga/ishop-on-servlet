package ishop.servlet.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ishop.servlet.AbstractController;
import ishop.util.RoutingUtils;

/**
 * 
 * @author Fedorov Aleksandr
 * msg2fedorov@gmail.com
 *
 */
@WebServlet("/products/*")
public class ProductsByCategoryController extends AbstractController {
	private static final int SUBSTRING_INDEX = "/products".length();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String categoryUrl = req.getRequestURI().substring(SUBSTRING_INDEX);
		RoutingUtils.forwardToPage("products.jsp", req, resp);
	}
}
