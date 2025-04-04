module com.mycompany.softwarefinal {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.softwarefinal to javafx.fxml;
    exports com.mycompany.softwarefinal;
}
