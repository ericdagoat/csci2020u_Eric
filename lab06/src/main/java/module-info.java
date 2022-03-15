module com.example.lab06 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires javafx.graphics;

    opens com.example.lab06 to javafx.fxml;
    exports com.example.lab06;
}