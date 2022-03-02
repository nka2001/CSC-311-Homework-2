module group1.csc311hw2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens group1.csc311hw2 to javafx.fxml;
    exports group1.csc311hw2;
}
