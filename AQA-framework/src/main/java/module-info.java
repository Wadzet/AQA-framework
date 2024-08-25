module com.example.aqaframework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aqaframework to javafx.fxml;
    exports com.example.aqaframework;
}