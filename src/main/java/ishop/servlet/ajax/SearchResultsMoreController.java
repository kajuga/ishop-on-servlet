package ishop.servlet.ajax;

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
@WebServlet("/ajax/html/more/search")
public class SearchResultsMoreController extends AbstractController {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RoutingUtils.forwardToFragment("product-list.jsp", req, resp);
	}
}
