package com.example.hw4;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AddressButton;

    @FXML
    private Button EnterButton;

    @FXML
    private TextField NameButton;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        EnterButton.setOnAction(actionEvent -> {
            try {
                dbHandler.signUpUser(NameButton.getText(),AddressButton.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        EnterButton.setOnAction(actionEvent -> {
            EnterButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("app.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });



    }


}