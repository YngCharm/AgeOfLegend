package com.example.ageoflegend;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public Label label;
    public AnchorPane rootContainer;
    public TextField loginTF;
    public PasswordField passwordTF;

    @FXML
    public void initialize() {
        Font.loadFont(getClass().getResourceAsStream("/fonts/Pacifico-Regular.ttf"), 14);
        label.getStyleClass().add("label-pacifico");
    }

    @FXML
    public void labelLoginClick(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("registration-view.fxml"));
        Stage stage = (Stage) rootContainer.getScene().getWindow();

        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }
}