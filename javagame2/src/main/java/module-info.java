module vis {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires com.google.gson;
    opens Sample to javafx.fxml;
          exports Sample;
}
