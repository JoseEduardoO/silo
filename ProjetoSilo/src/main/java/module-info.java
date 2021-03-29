module com.mycompany.projetosilo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.projetosilo to javafx.fxml;
    exports com.mycompany.projetosilo;
}
