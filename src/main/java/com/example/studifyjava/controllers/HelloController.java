package com.example.studifyjava.controllers;

import com.example.studifyjava.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void handleAddCourseClick() throws IOException {
        SceneController.launchScene("add-course.fxml");
    }

    @FXML
    public void handleAddStudentClick() throws IOException{
        SceneController.launchScene("add-student.fxml");
    }

}