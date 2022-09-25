package com.example.studifyjava.controllers;

import com.example.studifyjava.SceneController;
import javafx.fxml.FXML;

import java.io.IOException;

public class CourseController {
    @FXML
    public void goHome() throws IOException{
        SceneController.launchScene("homepage.fxml");
    }

    @FXML
    public void addCourse() throws IOException{
        //call the fun to add course
        SceneController.launchScene("homepage.fxml");
    }
}
