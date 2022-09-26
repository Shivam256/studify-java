package com.example.studifyjava;

import com.example.studifyjava.datamodels.Course;
import com.example.studifyjava.db.AVLTree;
import com.example.studifyjava.db_functions.CourseFunctions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main extends Application {
    static Parent root;
    static Stage primaryStage;

    static Main m = null;

    static Main getMainApplication() {
        return m;
    }

    static Parent getRoot() {
        return root;
    }

    static void setRoot(Parent root) {
        Main.root = root;
    }

    static Stage getStage() {
        return primaryStage;
    }

    static void setStage(Stage stage) {
        Main.primaryStage = stage;
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Main.primaryStage = primaryStage;
            primaryStage.setTitle("STUDIFY");
            Scene scene = new Scene(root, 880, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    @Override
    public void stop() {
        //serialize the trees
        System.out.println(CourseFunctions.CourseTree.root.maxId + " this is life");
        CourseFunctions.CourseTree.serializeData(CourseFunctions.CourseTree.root, "courses.txt");
    }

    public static void main(String[] args) throws IOException {
        //if course.txt presene deserialize and set to tree else
//       File courseTxt  = new File("courses.txt");
        CourseFunctions.CourseTree = new AVLTree();
//
        File f = new File("courses.txt");

        if (f.exists()) {
            CourseFunctions.CourseTree.root = CourseFunctions.CourseTree.decerializeData("courses.txt");
            System.out.println(CourseFunctions.CourseTree.root.maxId + " yo");
            Course.courseId = CourseFunctions.CourseTree.root.maxId + 1;

        }

        launch();
    }
}
