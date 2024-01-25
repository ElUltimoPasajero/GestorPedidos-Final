module com.example.demostracionhilos_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demostracionhilos_1 to javafx.fxml;
    exports com.example.demostracionhilos_1;
}