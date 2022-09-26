package com.example.studifyjava.db_functions;

import com.example.studifyjava.datamodels.Course;
import com.example.studifyjava.db.AVLTree;

public class CourseFunctions {

    public static AVLTree CourseTree;
    public static void addCourse(String name, String description){
        System.out.println("adding the course");
        System.out.println(name + " " + description);
        Course course = new Course(name,description);
        CourseTree.root = CourseTree.insert(CourseTree.root,course);
    }

    public static void getAllCourses(){
        CourseTree.printCourseTree((Course)CourseTree.root);
    }

    public static void getLatestId(){

    }

    public static void getNumCourses(){

    }
}
