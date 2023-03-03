module com.example.hw4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hw4 to javafx.fxml;
    exports com.example.hw4;
}