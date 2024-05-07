module com.empresa.registro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.registro to javafx.fxml;
    exports com.empresa.registro;
}