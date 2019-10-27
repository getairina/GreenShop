package com.UG.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Controller {


    public void switchWindow(ActionEvent actionEvent) throws IOException {
        MenuItem m = (MenuItem) actionEvent.getSource();
        while (m.getParentPopup() == null) {
            m = m.getParentMenu();
        }

        Scene s = m.getParentPopup().getOwnerWindow().getScene();
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("switch.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage) s.getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    public void showClosingDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Are you sure you want to exit?");
        alert.setHeaderText("Really, really?");
        alert.setContentText("Ok, as you wish");

        ButtonType buttonTypeYes = new ButtonType("YES");
        ButtonType buttonTypeNo = new ButtonType("NO");

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == buttonTypeYes) {
            System.out.println("Exiting!");
        }
        else {
            // do nothing
        }
    }
}
