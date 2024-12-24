package com.example.ageoflegend;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RegistrationController {
    public TextField loginTFReg;
    public PasswordField passwordTFReg;
    public TextField firstNameTFReg;
    public TextField fisrtNameTFReg;
    public AnchorPane rootContainer;
    public Label label;
    public ComboBox comboBox;
    public RadioButton male;
    public RadioButton female;

    public void initialize() {
        Font.loadFont(getClass().getResourceAsStream("/fonts/Pacifico-Regular.ttf"), 14);
        label.getStyleClass().add("label-pacifico");
        comboBox.getStyleClass().add("combo-box");
        radioBtn();
    }

    public void labelRegClick(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        Stage stage = (Stage) rootContainer.getScene().getWindow();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void radioBtn() {
        ToggleGroup toggleGroup = new ToggleGroup();
        male.setToggleGroup(toggleGroup);
        female.setToggleGroup(toggleGroup);

    }
}
