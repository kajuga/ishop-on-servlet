package ishop.servlet;

import ishop.service.BusinessService;
import ishop.service.ServiceManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "AbstractController")
public class AbstractController extends HttpServlet {

    private BusinessService businessService;

    @Override
    public final void init() throws ServletException {
        businessService = ServiceManager.getInstance(getServletContext()).getBusinessService();
    }

    public final BusinessService getBusinessService() {
        businessService = ServiceManager.getInstance(getServletContext()).getBusinessService();
        return businessService;
    }




}
