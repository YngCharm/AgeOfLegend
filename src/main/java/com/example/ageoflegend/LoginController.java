package com.example.ageoflegend;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class LoginController {

    @FXML
    public Label label;
    public AnchorPane rootContainer;
    public TextField loginTF;
    public PasswordField passwordTF;

    @FXML
    public void initialize() {
        Font.loadFont(getClass().getResourceAsStream("/fonts/Pacifico-Regular.ttf"), 14);
        label.setStyle("-fx-font-family: 'Pacifico';");
        /*passwordTF.setStyle("-fx-font-family: 'Pacifico';");
        loginTF.setStyle("-fx-font-family: 'Pacifico';");*/
    }
}