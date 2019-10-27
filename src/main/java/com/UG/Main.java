package com.UG;

import com.UG.controller.Controller;
import com.UG.controller.AddController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main extends Application {
    Controller controller;


    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResourceAsStream("resources/view/main.fxml"));

        primaryStage.setTitle("GreenShop"); // title of window
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(600);

        controller = fxmlLoader.getController();

        //without lambda
//        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//                                           @Override
//                                           public void handle(WindowEvent event) {
//                                           }
//                                       });
        primaryStage.setOnCloseRequest(event -> {
            controller.showClosingDialog();
        });

        primaryStage.show(); // show the actual window
    }
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GreenShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        launch(args);
    }

}
