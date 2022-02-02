package com.springrest.springrest.controller;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
@Autowired
    private courseService service;
    @GetMapping("/home")
    public String home(){
        return "changing the text of home";
    }
    //get the courses
@GetMapping("/courses")
    public List<course> getCourse(){
       return this.service.getCourse();
    }
    // checking...
}
