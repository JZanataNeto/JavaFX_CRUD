module com.joaozanata.javafx_crud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.joaozanata.javafx_crud to javafx.fxml;
    exports com.joaozanata.javafx_crud;
}