package com.example.studifyjava.datamodels;

public class Course extends Node {
    String courseName;
    String courseDescription;

    Course(int _id,String name,String desc) {
        super(_id);

        this.courseName=name;
        this.courseDescription=desc;
    }
}
