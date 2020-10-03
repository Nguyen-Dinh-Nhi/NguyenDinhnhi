package com.nguyendinhnhi.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringWebIntializer implements WebApplicationInitializer {
public void onStartup(ServletContext container) throws ServletException {
AnnotationConfigWebApplicationContext context = new
AnnotationConfigWebApplicationContext();
context.register(SpringConfiguration.class);
context.setServletContext(container);
ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new
DispatcherServlet(context));
servlet.setLoadOnStartup(1);
servlet.addMapping("/");
}
}
