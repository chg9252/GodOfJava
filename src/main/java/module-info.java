module com.example.godofjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.godofjava to javafx.fxml;
    exports com.example.godofjava;
}