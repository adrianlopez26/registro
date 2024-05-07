package com.empresa.registro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.setTitle("Registro de usuario");

        // Obtener el controlador del archivo FXML
        UserController controller = loader.getController();

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}