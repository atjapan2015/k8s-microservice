package site.k8scloud.course;


import site.k8scloud.course.config.ConfigTestController;


import site.k8scloud.course.resilient.ResilienceController;


import site.k8scloud.course.metric.MetricController;


import site.k8scloud.course.secure.TestSecureController;


import site.k8scloud.course.client.ClientController;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped
public class CourseRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        
        classes.add(ConfigTestController.class);
        
        
        classes.add(ResilienceController.class);
        
        
        classes.add(MetricController.class);
        
        
        classes.add(ClientController.class);
        
        
        classes.add(TestSecureController.class);
        
        return classes;
    }
}
