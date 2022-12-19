package com.example.yemekservis;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;
import java.util.Objects;
import java.util.Optional;

public class AdminEkranController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    void KasiyerEkleCikarEkraninaGir(MouseEvent event) {

    }

    @FXML
    void ParaYonetimEkrani(MouseEvent event) {

    }

    @FXML
    void cikis(MouseEvent event) throws IOException {
        //Uyarı ekranı oluşturma
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("UYARI");
        alert.setHeaderText("Çıkış yapmak üzeresiniz, emin misiniz ?");

        ButtonType evet = new ButtonType("Evet");
        ButtonType no = new ButtonType("Hayır");


        // Remove default ButtonTypes
        alert.getButtonTypes().clear();

        alert.getButtonTypes().addAll(evet,no);

        // option != null.
        Optional<ButtonType> option = alert.showAndWait();

        if (option.get() == evet) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AnaGiris.fxml")));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


    @FXML
    void marketEkraninaGit(MouseEvent event) {

    }

}
