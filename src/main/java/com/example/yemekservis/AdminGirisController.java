package com.example.yemekservis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdminGirisController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    void girisYap(ActionEvent event) throws IOException {
        //kullanıcı adı ve şifre kontrol edilecek
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminEkran.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
