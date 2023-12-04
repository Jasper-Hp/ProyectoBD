module app.transbus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires MaterialFX;


    opens app.transbus to javafx.fxml;
    exports app.transbus;
    opens app.transbus.Controller to javafx.fxml;

    opens dto to javafx.base;

}