package com.example.studifyjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
            primaryStage.setTitle("JAVA FX REVISION");
            Scene scene = new Scene(root, 880, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
