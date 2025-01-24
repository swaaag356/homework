module org.example.lab12 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.lab12 to javafx.fxml;
    exports org.example.lab12;
}