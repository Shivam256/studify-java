package com.example.studifyjava.controllers;

import com.example.studifyjava.datamodels.Course;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CourseItemController {
    @FXML
    Label courseName;

    @FXML
    Label courseDescription;

    @FXML
    public void click(){
        //do somehting
    }

    private Course course;

    public void setData(Course course){
        this.course = course;
    }
}
