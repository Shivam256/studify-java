package com.example.studifyjava.datamodels;

public class Student extends Node {
    String name;
    String email;
    double phoneNo;
    int age;
    int courseId;



    Student(int _id,String name,String email,double phoneNo,int age,int courseId) {
        super(_id);
        this.name=name;
        this.age=age;
        this.email=email;
        this.phoneNo=phoneNo;
        this.courseId=courseId;
    }
}
