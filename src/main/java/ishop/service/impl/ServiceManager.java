package ishop.service.impl;

import ishop.service.OrderService;
import ishop.service.ProductService;

import javax.servlet.ServletContext;

public class ServiceManager {
    public static ServiceManager getInstance(ServletContext context) {
        ServiceManager instance = (ServiceManager) context.getAttribute("SERVICE_MANAGER");
        if (instance == null) {
            instance = new ServiceManager(context);
            context.setAttribute("SERVICE_MANAGER", instance);
        }
        return instance;
    }

    public void close() { //close resources
         }


        private ProductService productService;
        private OrderService orderService;

    public ProductService getProductService() {
        return productService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    private ServiceManager(ServletContext context) {
            //init services
            productService = new ProductServiceImpl();
            orderService = new OrderServiceImpl();
        }
    }