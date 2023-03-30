package com.SpringBootLerning.SpringBoot;

//http://localhost:8080/courses

/*
[
 {
  "id":1,
  "name": "Learn AWS",
  "author": "in28minutes"
  }
 ]
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //courses: id, name, author
    @GetMapping("/subject")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"ABC","hema"),
                new Course(2,"XYZ","kritika"),
                new Course(3,"MNO","mansi"),
                new Course(4,"BCD","rashi"),
                new Course(5,"EFG","devanshi"),
                new Course(6,"HIL","kushwant"),
                new Course(7,"JKV","vijay"),
                new Course(8,"LMN","tarun"),
                new Course(9,"OPQ","medha"),
                new Course(10,"RSV","moksh")

        );
    }

}
