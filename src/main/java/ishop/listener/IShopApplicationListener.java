package ishop.listener;

import ishop.service.impl.ServiceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class IShopApplicationListener implements ServletContextListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(IShopApplicationListener.class);
    private ServiceManager serviceManager;


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        serviceManager = ServiceManager.getInstance(sce.getServletContext());
        LOGGER.info("Web application 'ishop' initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        serviceManager.close();
        LOGGER.info("Web application 'ishop' destroyed");

    }
}