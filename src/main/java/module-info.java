module kg.avicenna.avicenna {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens kg.avicenna.avicenna to javafx.fxml;
    exports kg.avicenna.avicenna;
}