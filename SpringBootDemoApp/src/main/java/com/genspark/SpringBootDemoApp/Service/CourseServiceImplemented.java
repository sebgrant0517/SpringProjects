package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplemented implements CourseService{

    List<Course> list;

    public CourseServiceImplemented(){
        list = new ArrayList<>();
        list.add(new Course(101, "Core Java", "Adam"));
        list.add(new Course(102, "Advanced Java", "Jacob"));
        list.add(new Course(103, "Python", "Pradeep"));
    }

    @Override
    public List<Course> getCourses(){return list;}

    @Override
    public Course getCourse(int c_id){
        Course c = null;

        for(Course course : list){
            if(course.getC_id() == c_id){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course){
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course){
        Course c = null;

        for(Course c1 : list){
            if(c1.getC_id() == course.getC_id()){
                c = c1;
                c.setC_author(course.getC_author());
                c.setC_name(course.getC_name());
                break;
            }
        }
        return c;
    }

    @Override
    public String deleteCourse(int c_id){
        for(Course course : list){
            if(course.getC_id() == c_id){
                list.remove(course);
            }
        }
        return "Course Deleted Successfully";
    }

}
