package com.loke.mp3player;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.File;

public class Main extends Application implements EventHandler<ActionEvent> {

    private Scene scene;

    public static void main(String[]args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        File file = new FileChooser().showOpenDialog(null);
        if(!file.getName().endsWith(".mp3"))
            System.err.println("Not a mp3 file");

        init(primaryStage, file);
    }

    /*
    Makes the UI, etc
     */
    private void init(Stage primaryStage, File mp3File) {


        Group root = new Group();

        Label playIcon = GlyphsDude.createIconLabel(FontAwesomeIcon.PLAY, "", "38px", null, ContentDisplay.GRAPHIC_ONLY);
        Label pauseIcon = GlyphsDude.createIconLabel(FontAwesomeIcon.PAUSE, "", "38px", null, ContentDisplay.GRAPHIC_ONLY);
        Button playButton = new Button();
        playButton.setGraphic(playIcon);

        Button pauseButton = new Button();
        pauseButton.setGraphic(pauseIcon);
        primaryStage.setScene(new Scene(root, 500, 200));
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }

}

