package com.destin.basededonnees;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.*;

public class FenetreController3 {

    @FXML
    private Button menu;

    @FXML
    private TextField prenom;

    @FXML
    private Button supprimer;


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

    public void supprimer(ActionEvent actionEvent) {

        String url="jdbc:mysql://localhost:3306/universite?serverTimezone=UTC";
        String userName="root";
        String password="Pnr!1979";


        try {
            Connection con = DriverManager.getConnection(url,userName,password);

            Statement statement = con.createStatement();

            String sql ="DELETE FROM etudiant WHERE PrenomEtudiant=?";


            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,prenom.getText());
            pst.execute();




        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Elément supprimé");
        prenom.setText("");



    }
}
