module com.veike.app1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.veike.app1 to javafx.fxml;
    exports com.veike.app1;
}