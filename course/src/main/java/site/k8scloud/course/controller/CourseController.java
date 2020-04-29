package site.k8scloud.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value = "/course")
public class CourseController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello World";
    }
}
