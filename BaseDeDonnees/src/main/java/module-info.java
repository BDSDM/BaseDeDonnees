module com.destin.basededonnees {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.destin.basededonnees to javafx.fxml;
    exports com.destin.basededonnees;
}