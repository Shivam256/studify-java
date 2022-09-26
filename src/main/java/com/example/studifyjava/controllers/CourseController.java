package com.example.studifyjava.controllers;

import com.example.studifyjava.SceneController;
import com.example.studifyjava.db_functions.CourseFunctions;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CourseController {

    @FXML
    TextField courseName;

    @FXML
    TextArea courseDescription;

    @FXML
    public void goHome() throws IOException{
        SceneController.launchScene("homepage.fxml");
    }

    @FXML
    public void handleAddCourse() throws IOException{
        //call the fun to add course
        CourseFunctions.addCourse(courseName.getText(), courseDescription.getText());
        CourseFunctions.getAllCourses();
        SceneController.launchScene("homepage.fxml");
    }
}
