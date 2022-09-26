package com.example.studifyjava.db_functions;

import com.example.studifyjava.datamodels.Course;
import com.example.studifyjava.db.AVLTree;

import java.util.ArrayList;

public class CourseFunctions {

    public static AVLTree CourseTree;
    public static void addCourse(String name, String description){
        System.out.println("adding the course");
        System.out.println(name + " " + description);
        Course course = new Course(name,description);
        CourseTree.root = CourseTree.insert(CourseTree.root,course);
    }

    public static ArrayList<Course> getAllCourses(){
        CourseTree.getCourses((Course)CourseTree.root);
        ArrayList<Course> courses = CourseTree.courses;
        return courses;
    }


    public static void getNumCourses(){

    }


}
