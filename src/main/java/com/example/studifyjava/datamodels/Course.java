package com.example.studifyjava.datamodels;

public class Course extends Node {
    String courseName;
    String courseDescription;

    public static int courseId = 1;

    public Course(String name,String desc) {
        super(courseId);
        courseId++;
        this.courseName=name;
        this.courseDescription=desc;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
