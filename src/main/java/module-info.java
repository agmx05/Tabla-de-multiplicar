module com.mycompany.tablasdemultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tablasdemultiplicar to javafx.fxml;
    exports com.mycompany.tablasdemultiplicar;
}
