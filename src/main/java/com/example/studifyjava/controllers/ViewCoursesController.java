package com.example.studifyjava.controllers;

import com.example.studifyjava.SceneController;
import com.example.studifyjava.datamodels.Course;
import com.example.studifyjava.db_functions.CourseFunctions;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.IOException;

public class ViewCoursesController {
    @FXML
    public void goHome() throws IOException {
        SceneController.launchScene("homepage.fxml");
    }

    @FXML
    AnchorPane rootpage;

    @FXML
    VBox container;


    public void initialize() throws IOException {
        System.out.println("i am herererererererererere");

        for(Course c:CourseFunctions.getAllCourses()){
            VBox vb = new VBox();
            vb.setStyle("-fx-background-radius: 10px; -fx-border-radius: 10px; -fx-background-color: #fff; -fx-cursor: hand;");
            vb.setPrefHeight(120);
            vb.setPrefWidth(400);
            vb.setPadding(new Insets(10,10,10,10));
            vb.setSpacing(10);
            Label courseName = new Label(c.getCourseName());
            courseName.setFont(new Font("System Bold",24));
            Label courseDescription = new Label((c.getCourseDescription()));
            Button btn = new Button("VIEW COURSE");
            vb.getChildren().addAll(courseName,courseDescription,btn);
            container.getChildren().add(vb);
        }

    }
}
