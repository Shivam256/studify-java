package com.example.studifyjava;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneController {
    public static void launchScene(String sceneName) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(sceneName));
        Main.setRoot(loader.load());
        Scene scene = new Scene(Main.getRoot(),900,600);
        Main.getStage().setScene(scene);
        Main.getStage().show();
    }
}
