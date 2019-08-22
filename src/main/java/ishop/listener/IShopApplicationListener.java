package ishop.listener;

import ishop.service.ServiceManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class IShopApplicationListener implements ServletContextListener {
    private ServiceManager serviceManager;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        serviceManager = ServiceManager.getInstance(sce.getServletContext());
        serviceManager.getBusinessService().doSomething();
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        serviceManager.getBusinessService().doSomething();
        serviceManager.close();
    }
}