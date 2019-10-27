package com.UG.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddController {
    public MenuItem mnuswitch;
    public MenuItem mnuItemAddProduct;
    public Button btnSave;
    public Label lblProductName;
    public TextField txtFieldProductName;
    public Label lblUM;
    public Label lblQuantity;
    public Label lblPrice;
    public TextField txtFieldUM;
    public TextField txtFieldQuantity;
    public TextField txtFieldPrice;

    public void switchWindow(ActionEvent actionEvent) throws IOException {
        MenuItem m = (MenuItem) actionEvent.getSource();
        while (m.getParentPopup() == null) {
            m = m.getParentMenu();
        }

        Scene s = m.getParentPopup().getOwnerWindow().getScene();
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) s.getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
