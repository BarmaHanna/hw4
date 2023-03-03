package com.example.hw4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class DataController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView ImageButtonData;

    @FXML
    void initialize() {
        assert ImageButtonData != null : "fx:id=\"ImageButtonData\" was not injected: check your FXML file 'app.fxml'.";

    }

}

