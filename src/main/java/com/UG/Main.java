package com.UG;

import com.UG.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    private MainController mainController;

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GreenShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AtomicReference<FXMLLoader> fxmlLoader = new AtomicReference<>(new FXMLLoader());
        Parent root = fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/main.fxml"));

        primaryStage.setTitle("Green Shop"); // title of window
        primaryStage.setScene(new Scene(root, 600, 800));

        primaryStage.show(); // show the actual window
        mainController = fxmlLoader.get().getController();
        mainController.mnuItemAddProduct.setOnAction(event -> {
            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_product.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
