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
        try {
            serviceManager = ServiceManager.getInstance(sce.getServletContext());
            LOGGER.info("Web application 'ishop' initialized");
        } catch (RuntimeException e) {
            LOGGER.error("Web application 'ishop' init failed: " + e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        serviceManager.close();
        LOGGER.info("Web application 'ishop' destroyed");

    }
}