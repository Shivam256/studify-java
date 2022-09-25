package com.example.studifyjava.controllers;

import com.example.studifyjava.SceneController;
import javafx.fxml.FXML;

import java.io.IOException;

public class StudentController {
    @FXML
    public void goHome() throws IOException {
        SceneController.launchScene("homepage.fxml");
    }
}
