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
@WebServlet("/search")
public class SearchController extends AbstractController {
	private static final long serialVersionUID = 1015660808630879774L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("productCount", 24);
		RoutingUtils.forwardToPage("search-result.jsp", req, resp);
	}
}
