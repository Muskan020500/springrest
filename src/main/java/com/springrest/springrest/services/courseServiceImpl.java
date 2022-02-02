package com.springrest.springrest.services;

import com.springrest.springrest.entities.course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class courseServiceImpl implements courseService{

    List<course> list_of_courses;

    public courseServiceImpl() {
        list_of_courses = new ArrayList<>();
        list_of_courses.add(new course(157,"Java Course","this course is for learning java8"));
        list_of_courses.add(new course(1998,"Spring Boot Course","Creating rest api using spring"));

    }

    @Override
    public List<course> getCourse() {
        return list_of_courses;
    }
}
