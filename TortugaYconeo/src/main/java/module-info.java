module com.example.tortugayconeo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tortugayconeo to javafx.fxml;
    exports com.example.tortugayconeo;
}