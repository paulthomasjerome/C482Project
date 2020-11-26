package main;

import model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//TODO finish class documentation
/** This class runs an application that*/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    /** This is the main method. This is the first method called by the shell to start a java program */
    public static void main(String[] args) {
        launch(args);
    }

    public static void addTestData(Inventory inv) {

    }
}
