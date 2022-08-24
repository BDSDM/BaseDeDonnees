package com.destin.basededonnees;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class FenetreController0 implements Initializable {

    @FXML
    private Button afficher;
    @FXML
    private Button ajouter;







    public void afficher(ActionEvent actionEvent) {

        try {
            Node n = (Node) actionEvent.getSource();
            Stage stage1 = (Stage) n.getScene().getWindow();
            stage1.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre1.fxml"));
            fxmlLoader.getController();
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }
        catch(Exception e){}






    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ajouter(ActionEvent actionEvent) {


        try {
            Node n = (Node) actionEvent.getSource();
            Stage stage1 = (Stage) n.getScene().getWindow();
            stage1.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre2.fxml"));
            fxmlLoader.getController();
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }
        catch(Exception e){}

    }

    public void supprimer(ActionEvent actionEvent) {


        try {
            Node n = (Node) actionEvent.getSource();
            Stage stage1 = (Stage) n.getScene().getWindow();
            stage1.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre3.fxml"));
            fxmlLoader.getController();
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }
        catch(Exception e){}
    }
}
