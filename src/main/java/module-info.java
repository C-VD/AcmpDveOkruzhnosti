module com.example.acmpdveokruzhnosti {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.acmpdveokruzhnosti to javafx.fxml;
    exports com.example.acmpdveokruzhnosti;
}