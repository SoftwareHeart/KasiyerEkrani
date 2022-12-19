module com.example.yemekservis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yemekservis to javafx.fxml;
    exports com.example.yemekservis;
}