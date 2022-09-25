module com.example.studifyjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studifyjava to javafx.fxml;
    exports com.example.studifyjava;
    exports com.example.studifyjava.controllers;
    opens com.example.studifyjava.controllers to javafx.fxml;
}