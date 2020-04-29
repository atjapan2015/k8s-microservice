package site.k8scloud.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * exclude: close special configure
 */
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}
