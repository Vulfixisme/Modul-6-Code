module org.example.guinyoba {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.guinyoba to javafx.fxml;
    exports org.example.guinyoba;


}