package com.genspark.SpringBootDemoApp.Service;


import com.genspark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();
    Course getCourse(int c_id);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int c_id);
}
