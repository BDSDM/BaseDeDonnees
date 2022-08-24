package com.destin.basededonnees;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.*;

public class FenetreController1 {
    @FXML
    private TableColumn<Etudiant, Integer> id;

    @FXML
    private TableColumn<Etudiant, String> nom;

    @FXML
    private TableColumn<Etudiant, String> prenom;

    @FXML
    private TableView<Etudiant> table;

    @FXML
    private Button afficher;


    public ObservableList<Etudiant> data = FXCollections.observableArrayList();


    public void afficher(ActionEvent actionEvent) {

        data.clear();

        String url="jdbc:mysql://localhost:3306/universite?serverTimezone=UTC";
        String userName="root";
        String password="Pnr!1979";


        try {
            Connection con = DriverManager.getConnection(url,userName,password);

            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from etudiant");

            while(resultSet.next()){

                data.add(new Etudiant(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        id.setCellValueFactory(new PropertyValueFactory<Etudiant,Integer>("id"));
        prenom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("prenom"));
        nom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("nom"));

        table.setItems(data);



    }

    public void menu(ActionEvent actionEvent) {

        try {
            Node n = (Node) actionEvent.getSource();
            Stage stage1 = (Stage) n.getScene().getWindow();
            stage1.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre0.fxml"));
            fxmlLoader.getController();
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }
        catch(Exception e){}

    }
}
