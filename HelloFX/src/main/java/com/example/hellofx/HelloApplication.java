package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Stage stage = new Stage(); - that's how we create new stage.

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("favicon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("PRESS Q TO EXIT FULL SCREEN");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        stage.setScene(scene);
        // to show the stage and make sure we keep this at the end of the start method
        stage.show();

    }
}