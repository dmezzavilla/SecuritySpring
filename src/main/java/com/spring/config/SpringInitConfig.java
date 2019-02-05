package com.spring.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Daniel Mezzavilla
 */
public class SpringInitConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();

        webContext.register(SpringMvcConfig.class);
        webContext.setServletContext(servletContext);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);

        ServletRegistration.Dynamic reDynamic = servletContext.addServlet("dispatcher", dispatcherServlet);

        reDynamic.setLoadOnStartup(1);
        reDynamic.addMapping("/");
    }

}
