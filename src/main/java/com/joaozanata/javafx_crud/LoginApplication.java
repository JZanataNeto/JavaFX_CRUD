package com.joaozanata.javafx_crud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLogin = new FXMLLoader(LoginApplication.class.getResource("tela_login.fxml"));
        Scene scene = new Scene(fxmlLogin.load(), 250, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}
