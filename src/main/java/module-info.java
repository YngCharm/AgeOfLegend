module com.example.ageoflegend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ageoflegend to javafx.fxml;
    exports com.example.ageoflegend;
}